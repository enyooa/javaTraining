package javaTraining.association.aggregation.classesAndObjet4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Судный день", "и востали машины", 1);
        Person person = new Person("alex", 71);
        Library library = new Library();
        library.availableBook = book;

        person.display();

        library.lendBook(person);
        person.display();

        library.acceptBook(person);
        person.display();
    }
}
