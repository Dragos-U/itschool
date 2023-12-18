package org.session17stream.onlinepractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 6, 76);
        List<List<Integer>> lol = Arrays.asList(
                Arrays.asList(1, 2, 4, 5),
                Arrays.asList(9, 8),
                Arrays.asList(23, 67));

        List<String> ls = Arrays.asList("apple", "banane", "cherry");
        extractEven(li);

        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vel sapien at libero aliquet suscipit.";
        printContainingSubstring(input, "it");

        printSortedList(ls);

        List<Product> products = Arrays.asList(
                new Product("laptop", 1999.9),
                new Product("phone", 500.4),
                new Product("monitor", 999.9));
        printProductPrice(products);

        printListOfCharacters(ls);

        printIncreasedPrices(products);

        printFlatMap(lol);

        printCountedProducts(products);

        lazyStreamInitialization(ls);

        Optional<String> email = getEmail();
        if (email.isPresent()){
            System.out.println("email > "+email.get());
        } else {
            System.out.println("user with no email");
        }
    }

    private static Optional<String> getEmail(){
        return Optional.of("user@google.com");
    }


    private static void lazyStreamInitialization(List<String> input){
        Stream<String> stream = input
                .stream()
                .filter(s -> {
                    System.out.println("Filter > "+s);
                    return s.startsWith("b");
                })
                .map(s -> {
                    System.out.println("Map > "+s);
                    return s.toUpperCase();
                });

        System.out.println("Stream created, no operation performed yet");
        stream.forEach(s -> System.out.println(s));
    }

    private static void printFlatMap(List<List<Integer>> input){
        List<Integer> result = input
                .stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);
        System.out.println("---------------------------");

    }

    private static void printCountedProducts(List<Product> products){
        long count = products
                .stream()
                .filter(product -> product.getName().startsWith("l"))
                .filter(product -> product.getPrice() > 200)
                .count();
        System.out.println(count);
        System.out.println("---------------------------");

    }

    private static List<Integer> extractEven(List<Integer> li) {
        long timeStart = System.nanoTime();
        List<Integer> liEven = li
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
        Long duration = System.nanoTime() - timeStart;
        System.out.println(liEven);
        System.out.println("---------------------------");
        return liEven;
    }

    private static void printContainingSubstring(String input, String substring) {
        List<String> wordsContainingSubstring = Arrays.stream(input.split(" "))
                .filter(s -> s.contains(substring))
                .toList();
        System.out.println("Words containing substring: " + wordsContainingSubstring);
        System.out.println("---------------------------");
    }

    private static void printSortedList(List<String> input) {
        List<Integer> result = input
                .stream()
                .map(s -> s.length())
                .toList();
        System.out.println("Length of strings: " + result);
        System.out.println("---------------------------");

    }

    private static void printProductPrice(List<Product> products) {
        List<Double> li = products
                .stream()
                .map(p -> p.getPrice())  // Product::getPrice
                .toList();
        System.out.println(li);
        System.out.println("---------------------------");
    }

    private static void printListOfCharacters(List<String> input) {
        input
                .stream()
                .map(StreamPractice::stringToChar)
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    private static List<Character> stringToChar(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .toList();
    }

    private static void printIncreasedPrices(List<Product> products) {
        List<String> formattedPrices = products
                .stream()
                .map(product -> product.getPrice() * 1.1)
                .map(price -> "$ " + String.format("%.2f", price))
                .toList();
        System.out.println(formattedPrices);
        System.out.println("---------------------------");
    }

}
