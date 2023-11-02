package javaTraining.string.stringFormateTask;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("BMW X5", "Germany", 320),
                new Car("Tesla Model X", "USA", 190),
                new Car("Dodge Challenger", "USA", 240),
                new Car("Mazda Chort", "Japan", 99),
        };
//        System.out.println(cars[2].getModel().length());
//        System.out.println(cars[0].getCountry().length());

//        System.out.printf("%-16s  %-7s  %s\n", "Модель", "Страна", "Скорость");

//        for (int i = 4; cars.length > 0; i--){
//            System.out.printf("%16s  %-7s  %d\n", cars[i].getModel(), cars[i].getCountry(), cars[i].getMaxSpeed());
//        }
        System.out.println();

        for (Car car : cars) {
            System.out.printf("%-16s  %-7s  %d\n", car.getModel(), car.getCountry(), car.getMaxSpeed());
        }
    }
}
