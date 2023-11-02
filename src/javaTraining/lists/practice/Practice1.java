package javaTraining.lists.practice;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> femaleNames = new ArrayList<>(); // Создайте список
        femaleNames.add("Нурай");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1,"Айгерим"); // Добавьте имя "Айгерим"
        System.out.println(femaleNames); // Распечайте список
        System.out.println(femaleNames.get(0));
        System.out.println(femaleNames.size());
        System.out.println();

        for (int i = 0; i < femaleNames.size(); i++) {
            System.out.println(femaleNames.get(i));
        }
    }
}