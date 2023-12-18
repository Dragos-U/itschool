package org.session14collections.homework.onlineshoppingsystem.services;

import org.session14collections.homework.onlineshoppingsystem.src.Cart;
import org.session14collections.homework.onlineshoppingsystem.src.Product;

public class OrderAmount {

    private Cart cart;

    public static int calculateOrderAmount(Cart cart){
        int amount = 0;
        for(Product product : cart.getProducts()){
            amount += product.getPrice();
        }
        return amount;
    }
}
