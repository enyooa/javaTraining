package javaTraining.polymorphism.example2;

public class Weapon {
    String name;
    public Weapon(String name) {
        this.name = name;
    }

    void fire(){
        System.out.println("Звук по умолчанию");
    }
}
