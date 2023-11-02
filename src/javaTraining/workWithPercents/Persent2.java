package javaTraining.workWithPercents;

import java.util.Scanner;

public class Persent2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму заказа: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите процент: ");
        double percent = Double.parseDouble(scanner.nextLine());

        if (price > 10000 && percent > 5) {
            System.out.println("сумма с учётом " + (int) percent +"% скидки: " + (price - (price * percent/100)));
        } else {
            System.out.println("Скидки нет");
        }
    }
}
