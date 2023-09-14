package org.session14.homework.onlineshoppingsystem.src;

public class Product {

    private String name;
    private String description;
    private int price;
    private int quantity;

    private Product(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public static class Builder{
        private String name;
        private String description;
        private int price;
        private int quantity;

        public Builder(String name, int price){
            if(name == null || price <= 0) throw new IllegalStateException("Product must have a name and a price.");
            this.name = name;
            this.price = price;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
