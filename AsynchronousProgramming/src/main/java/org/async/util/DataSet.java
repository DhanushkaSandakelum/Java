package org.async.util;

import org.async.domain.checkout.Cart;
import org.async.domain.checkout.CartItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DataSet {
    public static List<String> lowerCaseAlphabetList = List.of("a", "b", "c", "d", "e");

    public static Cart createCart(int noOfItemsInCart) {
        Cart cart = new Cart();
        List<CartItem> cartItemList = new ArrayList<>();
        IntStream.rangeClosed(1, noOfItemsInCart)
                .forEach((index) -> {
                    String cartItem = "CartItem - ".concat(index + "");
                    CartItem cartItem1 = new CartItem(index, cartItem, generateRandomPrice(), index, false);
                    cartItemList.add(cartItem1);
                });

        cart.setCartItemList(cartItemList);
        return cart;
    }

    public static List<String> namesList() {
        return List.of("Bob", "John", "Peter", "Ann");
    }

    public static double generateRandomPrice() {
        int min = 50;
        int max = 100;

        return Math.random() * (max-min+1)*min;
    }
}
