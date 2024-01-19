package org.async.service;

import org.async.domain.checkout.Cart;
import org.async.domain.checkout.CartItem;
import org.async.domain.checkout.CheckoutResponse;
import org.async.domain.checkout.CheckoutStatus;

import java.util.List;
import java.util.stream.Collectors;

import static org.async.util.CommonUtil.startTimer;
import static org.async.util.CommonUtil.timeTaken;

public class CheckoutService {
    private PriceValidatorService priceValidatorService;

    public CheckoutService(PriceValidatorService priceValidatorService) {
        this.priceValidatorService = priceValidatorService;
    }

    public CheckoutResponse checkout(Cart cart) {
        startTimer();
        List<CartItem> priceValidationList = cart.getCartItemList()
                .parallelStream()
                .map(cartItem -> {
                    boolean isPriceInvalid = priceValidatorService.isCartItemInvalid(cartItem);
                    cartItem.setExpired(isPriceInvalid);
                    return cartItem;
                })
                .filter(CartItem::isExpired)
                .collect(Collectors.toList());

        if (priceValidationList.size() > 0) {
            return new CheckoutResponse(CheckoutStatus.FAILURE, priceValidationList);
        }

        timeTaken();
        return new CheckoutResponse(CheckoutStatus.SUCCESS);
    }
}
