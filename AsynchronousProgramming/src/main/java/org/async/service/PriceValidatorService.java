package org.async.service;

import org.async.domain.checkout.CartItem;

import static org.async.util.CommonUtil.*;

public class PriceValidatorService {
    public boolean isCartItemInvalid(CartItem cartItem) {
        int cartId = cartItem.getItemId();
        delay(500);

        if (cartId == 7 || cartId == 9 || cartId == 11) {
            return true;
        }

        return false;
    }
}
