package javaTraining.lists.practice;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {

        //пример с списком
        ArrayList<Integer> numbers = new ArrayList<>(); // Объявите список
        numbers.add(120);
        numbers.add(75);
        numbers.add(42);
        numbers.add(60);
        numbers.add(110);
        numbers.add(20);
        int counter = 0;
        for (Integer number : numbers) {
            if (number > 50) {
                counter += 1;
            }
        }
        System.out.println(counter);

        // пример с массивом
        int[] numbers2 = new int[6];
        numbers2[0] = 120;
        numbers2[1] = 75;
        numbers2[2] = 42;
        numbers2[3] = 60;
        numbers2[4] = 110;
        numbers2[5] = 20;

        int counter2 = 0;
        for (int number : numbers2) {
            if (number < 50) {
                counter2 += number;
            }
        }

        System.out.println(counter2);
    }
}

