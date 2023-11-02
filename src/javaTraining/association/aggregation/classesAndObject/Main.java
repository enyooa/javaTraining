package javaTraining.association.aggregation.classesAndObject;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("juGYgyugyug", "jhguygyu", 6);

        Library library = new Library();
        library.setAvailableBook(book);

        Student student = new Student("Олех", 7);

        System.out.println("Выводим данные студента после создания");
        student.display();
        System.out.println();

// ========================================================================================================================

        System.out.println("Выводим данные студента после того как взяли книгу из библиотеки");
        library.lendBook(student);
        student.display();
        System.out.println();

// ========================================================================================================================

        System.out.println("Выводим данные студента после того как отдали книгу библиотеке");
        library.acceptBook(student);
        student.display();
        System.out.println();

// ========================================================================================================================

        System.out.println("Выводим данные библиоеки после того как взяли книгу от студента");
        library.acceptBook(student);
        library.display();
    }
}