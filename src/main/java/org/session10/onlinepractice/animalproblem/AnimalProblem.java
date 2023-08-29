package org.session10.onlinepractice.animalproblem;

public class AnimalProblem {

    public static void main(String[] args) {

        Mammal mammal = new Mammal("Wolf");
        mammal.eat();

        Bird bird = new Bird("Sparrow");
        bird.eat();

        Fish fish = new Fish("Goldfish");
        fish.eat();
    }
}
