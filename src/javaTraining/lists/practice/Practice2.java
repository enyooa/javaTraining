package javaTraining.lists.practice;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.47);
        expenses.add(290.24);
        expenses.add(420.78);
        System.out.println("Сейчас в списке:");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата " + i + ": " + expenses.get(i) + " тенге.");
        }
    }
}
