package javaTraining.association.aggregation.classesAndObject2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Сколько хотите добавить книг?");
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Введите title книги: ");
            String title = scanner.nextLine();

            System.out.println("Введите author книги: ");
            String author = scanner.nextLine();

            System.out.println("Введите id книги: ");
            int id = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, author, id);
            books.add(book);
            }
        for (Book book : books) {
            System.out.println("- ID: " + book.getId() + " Description: " + book.getTitle() + " Author: " + book.getAuthor());
        }
    }
}
