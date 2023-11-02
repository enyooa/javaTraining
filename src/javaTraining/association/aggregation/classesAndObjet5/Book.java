package javaTraining.association.aggregation.classesAndObjet5;

public class Book {
    private int id;
    private String author;
    private String title;
    private double rating;
    private static int serial = 1;

    public Book(String title, String author, double rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.id = getUniqueId();
    }

    void display(){
        System.out.println("Book{id: "+id+" Title: "+title+" Author: "+author+" Rating: "+rating);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }

    private static int getUniqueId() {
        return serial++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
