package javaTraining.polymorphism.example2;

public class HandGrenTh extends Weapon{
    public HandGrenTh(String name) {
        super(name);
    }

    @Override
    void fire() {
        System.out.println("Массивное ударное поражение");
    }
}
