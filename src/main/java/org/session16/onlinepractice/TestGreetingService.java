package org.session16.onlinepractice;

public class TestGreetingService {

    public static void main(String[] args) {
        GreetinService anonymousGreetingService = new GreetinService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonymousGreetingService.greet("Ionut");

        // lambda
        GreetinService lambdaGreetinService = message -> System.out.println("Hello " + message);
        lambdaGreetinService.greet("John");

    }
}
