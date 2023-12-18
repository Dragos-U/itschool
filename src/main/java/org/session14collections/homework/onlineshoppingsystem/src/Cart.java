package org.session14collections.homework.onlineshoppingsystem.src;

import java.util.List;

public class Cart {

    List<Product> products;

    private Cart(List<Product> products){
        this.products = products;
    }

    public static Cart createInstance(List<Product> products){
        return new Cart(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "CartInfo{" +
                "products=" + products +
                '}';
    }
}
