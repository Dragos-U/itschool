package org.session14.homework.onlineshoppingsystem;

import org.session14.homework.onlineshoppingsystem.application.OnlineStore;
import org.session14.homework.onlineshoppingsystem.enums.OrderStatus;
import org.session14.homework.onlineshoppingsystem.services.OrderAmount;
import org.session14.homework.onlineshoppingsystem.services.ShoppingCartManagement;
import org.session14.homework.onlineshoppingsystem.src.Cart;
import org.session14.homework.onlineshoppingsystem.src.Customer;
import org.session14.homework.onlineshoppingsystem.src.Order;
import org.session14.homework.onlineshoppingsystem.src.Product;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Customer johnDoe = new Customer.Builder("John")
                .email("john@gmail.com")
                .shippingAddress("Timisoara")
                .billingAddress("Bucuresti")
                .build();

        Product laptop1 = new Product.Builder("Laptop", 2000)
                .description("Acer series 5")
                .quantity(4)
                .build();

        Product monitor1 = new Product.Builder("Monitor", 1000)
                .description("Dell")
                .quantity(3)
                .build();

        List<Product> shopInventory = new ArrayList<>();
        shopInventory.add(laptop1);
        shopInventory.add(monitor1);

        List<Product> johnDoeListOfProducts = new ArrayList<>();
        johnDoeListOfProducts.add(laptop1);
        Cart johnDoeCart = Cart.createInstance(johnDoeListOfProducts);

        Order johnDoeOrder = new Order.Builder(1)
                .customer(johnDoe)
                .products(johnDoeListOfProducts)
                .orderStatus(OrderStatus.PROCESSING)
                .build();

        Map<Customer, Order> customerOrderMap = new HashMap<>();
        customerOrderMap.put(johnDoe, johnDoeOrder);

        OnlineStore emag = new OnlineStore.Builder("Emag")
                .inventory(shopInventory)
                .customerMap(customerOrderMap)
                .build();

        ShoppingCartManagement shoppingCartManagement = ShoppingCartManagement.createInstance(johnDoeCart);
        shoppingCartManagement.addProductToCart(monitor1);

        System.out.println(johnDoe);
        System.out.println(laptop1);

        System.out.println("Sum to pe paid > $ "+OrderAmount.calculateOrderAmount(johnDoeCart));


    }
}
