package javaTraining.encapsulation.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько студентов будут в программе?");
        int size = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[size];

        for (int i = 0; i < students.length; i++) {
            Student student = new Student();

            System.out.println("Введите имя студента: ");
            student.setName(scanner.nextLine());

            System.out.println("Введите возраст студента: ");
            student.setAge(Integer.parseInt(scanner.nextLine()));

            System.out.println("Введите оценку студенту: ");
            student.setScore(Double.parseDouble(scanner.nextLine()));

            students[i] = student;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Имя "+students[i].getName()+"\nВозраст "+students[i].getAge()+"\nОценка "+students[i].getScore());
            System.out.println();
        }
    }
}