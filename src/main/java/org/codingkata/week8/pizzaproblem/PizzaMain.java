package org.codingkata.week8.pizzaproblem;

public class PizzaMain {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Size.LARGE, 0, 1, -2);
        Pizza pizza2 = new Pizza(Size.MEDIUM, 1, 2, 2);
        Pizza pizza3 = new Pizza(Size.SMALL, 2, 2, 2);

        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.addPizza(pizza1);
        pizzaOrder.addPizza(pizza2);
        pizzaOrder.addPizza(pizza3);
        pizzaOrder.addPizza(pizza3);
        System.out.println(pizza2.getDescription());
        System.out.println(pizza1.calcCost());
        System.out.println(pizzaOrder.getTotalCost());
    }
}