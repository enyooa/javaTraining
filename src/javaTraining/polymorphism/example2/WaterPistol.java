package javaTraining.polymorphism.example2;

public class WaterPistol extends Weapon {
    public WaterPistol(String name) {
        super(name);
    }

    @Override
    void fire() {
        System.out.println("Желтый дожд");
    }
}
