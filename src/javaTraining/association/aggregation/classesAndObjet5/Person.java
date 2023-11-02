package javaTraining.association.aggregation.classesAndObjet5;

public class Person {
    private String name;
    private int age;
    private Book currentBorrowedBook;
    private Book lastBorrowedBook;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age+" currentBook: "+currentBorrowedBook+" oldLastBook: "+lastBorrowedBook);
    }


    public void setCurrentBorrowedBook(Book currentBorrowedBook) {
        this.currentBorrowedBook = currentBorrowedBook;
    }

    public Book getCurrentBorrowedBook() {
        return currentBorrowedBook;
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }

    public Book getLastBorrowedBook() {
        return lastBorrowedBook;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
