package org.session15.homework.bulkchallenges;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Pair<T, U> {

    private T object1;
    private U object2;
}

class TestPair {

    public static void main(String[] args) {
        Person bob = new Person("Bob", 34, null);
        Product laptop = new Product("Lenovo", 2344, 222);
        Pair<Person, Product> pair = new Pair<>(bob, laptop);

        System.out.println(pair);
    }
}
