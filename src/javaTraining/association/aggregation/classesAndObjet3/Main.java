package javaTraining.association.aggregation.classesAndObjet3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("1. Добавить книгу");
            System.out.println("2. Выйти и распечатать все книги");
            String command = scanner.nextLine();
            if ("1".equals(command)) {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();

                System.out.print("Введите автор книги: ");
                String author = scanner.nextLine();

                books.add(new Book(title, author));
                System.out.println();
            } else if (command.equals("2")) {
                System.out.println();
                for (Book book : books) {
//                    System.out.println("Book={id=" + book.getId() + ", title=" + book.getTitle() + ", author=" + book.getAuthor() + "}");
                    book.display();
                }
                break;
            }
        }
    }
}