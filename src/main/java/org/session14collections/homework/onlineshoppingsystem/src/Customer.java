package org.session14collections.homework.onlineshoppingsystem.src;

public class Customer {

    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;

    private Customer(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.shippingAddress = builder.shippingAddress;
        this.billingAddress = builder.billingAddress;
    }

    public static class Builder {
        private String name;
        private String email;
        private String shippingAddress;
        private String billingAddress;

        public Builder(String name) {
            if (name == null) throw new IllegalStateException("Customer must have a name.");
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder billingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                '}';
    }
}
