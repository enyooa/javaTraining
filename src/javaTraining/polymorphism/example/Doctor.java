package javaTraining.polymorphism.example;

public class Doctor {
    // методы для каждого
    public void healLion(Lion lion) {
        System.out.println("Лев здоров");
    }
    public void healTiger(Tiger tiger) {
        System.out.println("Тигр здоров");
    }
    public void healCheetah(Cheetah cheetah) {
        System.out.println("Гепард здоров");
    }

    //Общий метод для всех
    public void healCat(Cat cat) {
        System.out.println("Пациент здоров");
        // Если добавим: cat.run(); получим разные сецификации каждых объектов
        cat.run();
    }
}
