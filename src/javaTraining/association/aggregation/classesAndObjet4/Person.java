package javaTraining.association.aggregation.classesAndObjet4;
public class Person {
    private String name;
    private int age;
    private Book currentBorowedBook;
    private Book lastBorrowedBook;

    void display(){
        System.out.println("Имя человека " + name + " Возраст " + age + " Текущая книга " + currentBorowedBook + " Последняя взятая книга " + lastBorrowedBook);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getCurrentBorowedBook() {
        return currentBorowedBook;
    }

    public void setCurrentBorowedBook(Book currentBorowedBook) {
        this.currentBorowedBook = currentBorowedBook;
    }

    public Book getLastBorrowedBook() {
        return lastBorrowedBook;
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }
}
