package javaTraining.association.composition.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getEngine().message());
    }
}
