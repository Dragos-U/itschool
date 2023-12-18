package org.session14collections.onlinepractice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products1 = initializeSet();
//        displayProducts(products1);

        Set<String> products2 = initializeSet();
        products2.add("P400");
        products2.add("P500");

        displayProducts(mergeProducts(products1,products2));
    }

    private static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100");
        products.add("P200");
        products.add("P300");

        return products;
    }

    private static void displayProducts(Set<String> products){
        for(String product : products){
            System.out.println(product);
        }
    }

    private static Set<String> mergeProducts(Set<String> firstSet,Set<String> secondSet){
        Set<String> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }
}
