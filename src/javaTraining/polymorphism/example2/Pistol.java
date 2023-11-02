package javaTraining.polymorphism.example2;

public class Pistol extends Weapon {
    public Pistol(String name) {
        super(name);
    }

    @Override
    void fire() {
        System.out.println("Одиночные выстрелы");
    }
}
