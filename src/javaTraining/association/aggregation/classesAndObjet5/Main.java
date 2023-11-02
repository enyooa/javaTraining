package javaTraining.association.aggregation.classesAndObjet5;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.books[0] = new Book("HR", "Pushkin", 1.23);
        library.books[1] = new Book("LR", "Shushkin", 1.55);
        library.books[2] = new Book("SSD", "Ses", 1.55);

        Person person = new Person("person1", 20);
        library.lendBook(person, "HR");

        person.display();
        library.display();
        System.out.println();

        person.setCurrentBorrowedBook(library.books[1]);
        person.getCurrentBorrowedBook().getTitle();
        person.display();
        library.display();
        System.out.println();

        person.setLastBorrowedBook(library.books[1]);
        person.getLastBorrowedBook().getTitle();
        person.display();
        library.display();
        System.out.println();
    }
}
