package org.async.service;

import org.async.domain.checkout.Cart;
import org.async.domain.checkout.CheckoutResponse;
import org.async.domain.checkout.CheckoutStatus;
import org.async.util.DataSet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutServiceTest {
    PriceValidatorService priceValidatorService = new PriceValidatorService();
    CheckoutService checkoutService = new CheckoutService(priceValidatorService);

    @Test
    public void checkout_6_items() {
        // given
        Cart cart = DataSet.createCart(6);

        // when
        CheckoutResponse checkoutResponse = checkoutService.checkout(cart);

        // then
        assertEquals(CheckoutStatus.SUCCESS, checkoutResponse.getCheckoutStatus());
    }
}