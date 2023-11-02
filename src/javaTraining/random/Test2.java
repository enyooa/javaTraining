package javaTraining.random;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Укажите начальный диапазон");
        int origin = scanner.nextInt();
        System.out.println("Укажите конечный диапазон");
        int bound = scanner.nextInt();
        int generateNumber = random.nextInt(origin, bound+1);
        System.out.print("Укажите количество попыток ");
        int size = scanner.nextInt();
        System.out.print("Угадайте число от " + origin + " до " + bound + " у вас " + size + " попыток: ");
        for (int i = size-1; i > 0; i--) {
            int responsive = scanner.nextInt();
            if (generateNumber == responsive){
                System.out.print("Ура, вы угадали число! ");
                break;
            } else if (generateNumber>responsive){
                System.out.print("Заданное число БОЛЬШЕ " + "осталось " + i + " ");
            } else {
                System.out.print("Заданное число МЕНЬШЕ " + "осталось " + i + " ");
            }
        }
        System.out.println(generateNumber);
    }
}
