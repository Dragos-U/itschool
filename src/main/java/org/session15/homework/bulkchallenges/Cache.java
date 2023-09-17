package org.session15.homework.bulkchallenges;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Cache<Object> {

    private Map<Integer, Object> cache;

    private Cache() {
        cache = new HashMap<>();
    }

    public static Cache createInstante() {
        return new Cache();
    }

    public void put(Object object) {
        int key = object.hashCode();
        cache.put(key, object);
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}

class TestCache {

    public static void main(String[] args) {
        Person alice = new Person("Alice", 30, "a@gmail.com");
        Person bob = new Person("Bob", 20, "b@gmail.com");
        Person ken = new Person("Ken", 40, "k@gmail.com");
        Person ted1 = new Person("Ted", 45, "t_1@gmail.com");
        Person ted2 = new Person("Ted", 45, "t_2@gmail.com");

        Cache<Person> cache = Cache.createInstante();
        cache.put(alice);
        cache.put(bob);
        cache.put(ken);
        cache.put(ted1);
        System.out.println(cache);

        cache.put(ted2);
        System.out.println(cache);
    }
}
