package org.session17.homework;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Problem14 {

    public static void main(String[] args) {
        List<Product> products = List.of(
                Product.builder().name("Laptop").category("IT").price(2000).build(),
                Product.builder().name("Monitor").category("IT").price(1000).build(),
                Product.builder().name("Mouse").category("IT").price(100).build(),
                Product.builder().name("Desk").category("Furniture").price(1500).build(),
                Product.builder().name("Chair").category("Furniture").price(1000).build());

        String categoryWithHighestAveragePrice = findCategoryWithHighestAveragePrice(products);
        System.out.println(categoryWithHighestAveragePrice);
    }

    public static String findCategoryWithHighestAveragePrice(List<Product> input) {

        Map<String, Double> categoryAvgPrice = input
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingInt(Product::getPrice)));

        Optional<Map.Entry<String, Double>> maxEntry = categoryAvgPrice
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            return maxEntry.get().getKey();
        } else {
            return "No category found.";
        }
    }
}
