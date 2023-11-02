package javaTraining.association.composition.example;

public class Car {
    private Engine engine;

    public Car(){
        this.engine = new Engine();
    }

    public Engine getEngine(){
        return engine;
    }
}
