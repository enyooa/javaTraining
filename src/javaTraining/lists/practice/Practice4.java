package javaTraining.lists.practice;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);


        //Вариант с foreach
        int sum = 0;
        for (int speed : speeds) {
            sum += speed;  // Сложите все значения в списке
        }

        //Вариант с for
//        int sum2 = 0;
//        for (int i = 0; i < speeds.size(); i++) {
//            sum2 += speeds[i]; //(неправильно)
//        }

        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");

//        int averageSpeed2 = sum2 / speeds.size();
//        System.out.println("Средняя скорость равна " + averageSpeed2 + " км/ч");
    }
}