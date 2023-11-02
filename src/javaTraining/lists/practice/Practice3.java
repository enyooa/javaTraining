package javaTraining.lists.practice;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        double[] temperaturess = new double[4];
        temperaturess[0] = 92.3;
        temperaturess[1] = 12.4;
        temperaturess[2] = 74.1;
        temperaturess[3] = 45.0;

        double max = 0;
        for (int i = 0; i < temperaturess.length; i++) {
            if (temperaturess[i] > max){
                max = temperaturess[i];
            }
        }
        System.out.println("Самая высокая температура: " + max + " °C.");
        System.out.println();

        //перевод на списки

        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(92.3);
        temperatures.add(12.4);
        temperatures.add(74.1);
        temperatures.add(45.0);

        double max1 = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > max1){
                max1 = temperatures.get(i);
            }
        }
        System.out.println("Самая высокая температура: " + max1 + " °C.");
        System.out.println();

        //список с помощю foreach

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(42);
        numbers.add(62);
        numbers.add(99);

        int max2 = 0;
        for (Integer number: numbers) {
            if (number > max2){
                max2 = number;
            }
        }
        System.out.println(max2);
    }
}
