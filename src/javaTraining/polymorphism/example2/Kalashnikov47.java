package javaTraining.polymorphism.example2;

public class Kalashnikov47 extends Weapon{
    public Kalashnikov47(String name) {
        super(name);
    }

    @Override
    void fire() {
        System.out.println("Автоматические и оденочные выстрелы");
    }
}