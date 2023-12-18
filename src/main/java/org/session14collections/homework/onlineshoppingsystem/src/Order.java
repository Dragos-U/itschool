package org.session14collections.homework.onlineshoppingsystem.src;

import org.session14collections.homework.onlineshoppingsystem.enums.OrderStatus;

import java.util.List;

public class Order {

    private int orderNumber;
    private OrderStatus orderStatus;
    private Customer customer;
    private List<Product> products;

    private Order(Builder builder){
        this.orderStatus = builder.orderStatus;
        this.customer = builder.customer;
        this.products = builder.products;
    }
    public static class Builder{
        private int orderNumber;
        private OrderStatus orderStatus;
        private Customer customer;

        private List<Product> products;

        public Builder(int orderNumber){
            if(orderNumber == 0) throw new IllegalStateException("The order must have a number.");
            this.orderNumber = orderNumber;
        }

        public Builder orderStatus(OrderStatus orderStatus){
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder customer(Customer customer){
            this.customer = customer;
            return this;
        }

        public Builder products(List<Product> products){
            this.products = products;
            return this;
        }
        public Order build(){
            return new Order(this);
        }

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNumber=" + orderNumber +
                ", orderStatus=" + orderStatus +
                ", customer=" + customer +
                ", product=" + products +
                '}';
    }
}
