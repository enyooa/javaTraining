package javaTraining.random;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generateNumber = random.nextInt(0, 10);
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число!");
            int responsive = scanner.nextInt();
            if (generateNumber == responsive){
                System.out.println("Ура, вы угадали число!");
                break;
            } else if (generateNumber>responsive){
                System.out.println("Заданное число БОЛЬШЕ");
            } else {
                System.out.println("Заданное число МЕНЬШЕ");
            }
        }
        System.out.println(generateNumber);
    }
}
