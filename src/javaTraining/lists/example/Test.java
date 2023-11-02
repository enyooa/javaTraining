package javaTraining.lists.example;

import java.util.ArrayList;
//Структура данных это набор эллеметов, разных типов: чисел, строк, классов объёрток
public class Test {
    public static void main(String[] args) {
//        ArrayList<String> studentNames = new ArrayList<>();

        // add (значение) - добавляет эллемент в конец списка
//        studentNames.add("Alex");
//        studentNames.add("Innocent");
//        studentNames.add("Жомарт");
//        // studentNames.add(String.valueOf(18));
//        System.out.println(studentNames);


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(0, 88);
        numbers.add(Integer.parseInt("42"));

        System.out.println(numbers);

    }
}
