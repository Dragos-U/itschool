package org.session14.homework.onlineshoppingsystem.services;

import org.session14.homework.onlineshoppingsystem.src.Cart;
import org.session14.homework.onlineshoppingsystem.src.Product;

public class ShoppingCartManagement {

    private final Cart cart;

    private ShoppingCartManagement(Cart cart) {
        this.cart = cart;
    }

    public static ShoppingCartManagement createInstance(Cart cart){
        return new ShoppingCartManagement(cart);
    }

    public void addProductToCart(Product product) {
        if(product == null) throw new IllegalStateException("Product should exist.");
        cart.getProducts().add(product);
    }

    public void removeProductFromCart(Product product) {
        if(product == null) throw new IllegalStateException("Product should exist.");
        cart.getProducts().remove(product);
    }
}
