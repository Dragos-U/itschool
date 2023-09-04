package org.session12.onlinepractice.compositionoverinheritance.composition;

public class Car {

    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    void start(){
        engine.start();
    }
}
