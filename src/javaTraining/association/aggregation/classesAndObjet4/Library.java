package javaTraining.association.aggregation.classesAndObjet4;

public class Library {
    Book availableBook;
    void lendBook(Person person) {
        if (availableBook != null && person.getCurrentBorowedBook() == null){
            person.setCurrentBorowedBook(availableBook);
            availableBook = null;
            System.out.println("Книгу передали человеку");
        } else {
            System.out.println("Такой команды и книги нет");
        }
    }

    void  acceptBook(Person person) {
        if (availableBook == null && person.getCurrentBorowedBook() != null){
            person.setLastBorrowedBook(person.getCurrentBorowedBook());
            availableBook = person.getCurrentBorowedBook();
            person.setCurrentBorowedBook(null);
            System.out.println("книги в библеотеки нет, книга у человека");
        }
    }
}
