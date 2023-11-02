package javaTraining.lists.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {
            System.out.print("Введите имя студента: ");
            //System.out.print("Введите имя студента (либо 'exit' для завершения): ");
            String name = scanner.nextLine();
            if ("".equals(name)) {
                //if(name.equals(""))
                //if(name.isEmpty())
                System.out.println("Программа завершилась");
                break;
            }
            students.add(name);
        }
        // 1 //System.out.println("Имена студентов: " + students);
        // 2 оптимальный// System.out.println("Имена студентов: " + String.join(", ", students));
        // 3 //
        for (String student : students) {
            System.out.print(student + ", ");
        }
    }
}