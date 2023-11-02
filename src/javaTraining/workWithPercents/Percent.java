package javaTraining.workWithPercents;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму заказа: ");
        double price = Double.parseDouble(scanner.nextLine());

        if (price > 20000) {
            System.out.println("сумма с учётом 7% скидки: " + (price - (price * 0.07)));
        }
        else if (price > 10000) {
            System.out.println("сумма с учётом 5% скидки: " + (price - (price * 0.05)));
        } else if (price < 500){
            System.out.println("сумма с учётом 1% скидки: " + (price - (price * 0.01)));
        } else {
            System.out.println("сумма с учётом 3% скидки: " + (price - (price * 0.03)));
        }
    }
}
