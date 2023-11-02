package javaTraining.association.aggregation.classesAndObject;
public class Library {
    private Book availableBook;

    void lendBook(Student student) {
        if (availableBook != null && student.getBorrowedBook() == null){
            student.setBorrowedBook(availableBook);
            availableBook = null;
        } else {
            System.out.println("Не доступная команда");
        }
    }

    void acceptBook(Student student){
        if (student.getBorrowedBook() != null && availableBook == null){
            availableBook = student.getBorrowedBook();
            student.setBorrowedBook(null);
        }
    }

    public void setAvailableBook(Book availableBook) {
        this.availableBook = availableBook;
    }

    void display(){
        System.out.print("Library: ");
        if (availableBook != null) {
            availableBook.display();
        }else {
            System.out.println("null");
        }
    }
}