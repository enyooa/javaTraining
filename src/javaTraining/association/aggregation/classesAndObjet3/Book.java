package javaTraining.association.aggregation.classesAndObjet3;

public class Book {
    private String title;
    private String author;
    private int id;
    private static int counterId = 1;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = generateId();
    }

    // show method
     void display() {
//        System.out.println("ID: " + id + " Description: " + title + " Author: " + author);
        System.out.println("Book={id=" + id + ", title=" + title + ", author=" + author + "}");
    }

    //     setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    private int generateId() {
        return counterId++;
    }
}