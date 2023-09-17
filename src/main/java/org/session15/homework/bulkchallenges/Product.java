package org.session15.homework.bulkchallenges;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString
public class Product {

    String name;
    int price;
    @EqualsAndHashCode.Include
    int id;
}

class TestProduct {

    public static void main(String[] args) {
        Product p1 = new Product("green apple", 2, 43);
        Product p2 = new Product("red apple", 3, 43);

        System.out.println("p1.equals(p2) ? " + p1.equals(p2));
        System.out.println("p1.hashcode() > " + p1.hashCode());
        System.out.println("p2.hashcode() > " + p2.hashCode());
    }
}
