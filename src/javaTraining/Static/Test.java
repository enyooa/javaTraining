package javaTraining.Static;

public class Test {
    public static void main(String[] args) {
        //Car c1 = new Car();

//        System.out.println("Статические переменная: " + c1.myStatic);
//        System.out.println("Не статические переменная: " + c1.notStatic);
//
//        System.out.println(Car.myStatic);
//        System.out.println(Car.notstatic);

        Car.myStatic += 20;
        Car c1 = new Car();
        System.out.println("Статическая переменная с1: " + c1.myStatic);
        c1.notStatic += 20;
        System.out.println("Не статическая переменная c1: " + c1.notStatic);
        Car c2 = new Car();
        System.out.println("Статическая переменная с2: " + c2.myStatic);
        System.out.println("Не статическая переменная с2: " + c2.notStatic);

    }
}
