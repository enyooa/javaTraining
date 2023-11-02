package javaTraining.association.aggregation.classesAndObjet5;


import java.util.Arrays;

public class Library {
    Book[] books;

    public Library() {
        books = new Book[3];
    }

    void display() {
        System.out.println("Book{id: " + Arrays.toString(books));
    }

    void lendBook(Person person, String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(bookName)) {
                person.setCurrentBorrowedBook(books[i]);
                books[i] = null;
                return;
            }
        }
    }

    void acceptBook(Person person) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = person.getCurrentBorrowedBook();
                person.setLastBorrowedBook(person.getCurrentBorrowedBook());
                person.setCurrentBorrowedBook(null);
                return;
            }
        }
    }
    // TODO: jkhguygyu
}
