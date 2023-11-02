package javaTraining.association.aggregation.classesAndObject;
public class Student {
    private String name;
    private int id;
    private Book borrowedBook;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.print("Student: " + name + "\nID: " + id + "\nBook: ");
        if (borrowedBook != null) {
            borrowedBook.display();
        }else {
            System.out.println("null");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}