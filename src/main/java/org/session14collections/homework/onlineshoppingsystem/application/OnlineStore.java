package org.session14collections.homework.onlineshoppingsystem.application;

import org.session14collections.homework.onlineshoppingsystem.src.Customer;
import org.session14collections.homework.onlineshoppingsystem.src.Order;
import org.session14collections.homework.onlineshoppingsystem.src.Product;

import java.util.List;
import java.util.Map;

public class OnlineStore {

    private String name;
    private List<Product> inventory;
    private Map<Customer, Order> customerOrderMap;

    public static class Builder{
        private String name;
        private List<Product> inventory;
        private Map<Customer, Order> customerOrderMap;

        public Builder(String name){
            if(name.equals(null)) throw new IllegalStateException("The store must have a name");
            this.name = name;
        }

        public Builder inventory(List<Product> inventory){
            this.inventory = inventory;
            return this;
        }

        public Builder customerMap(Map<Customer, Order> customerOrderMap){
            this.customerOrderMap = customerOrderMap;
            return this;
        }

        public OnlineStore build(){
            return new OnlineStore(this);
        }
    }

    private OnlineStore(Builder builder){
        this.name = builder.name;
        this.inventory = builder.inventory;
        this.customerOrderMap = builder.customerOrderMap;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public Map<Customer, Order> getCustomerCartMap() {
        return customerOrderMap;
    }
}
