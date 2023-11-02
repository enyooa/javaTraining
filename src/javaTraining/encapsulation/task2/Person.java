package javaTraining.encapsulation.task2;
public class Person {

    //переменные
    private String name;
    private int age;
    private int weight;

    //конструкторы
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //сеттеры
    public void setName(String name) {
        if (name.equals("черт") || name.equals("лох")) {
            System.out.println("как вам не стыдно!");
        } else if (name.equals("&") || name.equals("{") || name.equals("[") || name.equals("}") || name.equals("]") || name.equals(")") || name.equals("(")){
            System.out.println("Вы ввели запрещенный символ!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 15) {
            System.out.println("возраст не может быть меньше 17 лет");
        } else if (165 < age){
            System.out.println("возраст не может быть больше 165 лет");
        } else {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight < 65) {
            System.out.println("вес не может быть меньше 65 кг");
        } else if (77 < weight){
            System.out.println("вес не может быть больше 77 кг");
        } else {
            this.weight = weight;
        }
    }

    //геттеры
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getWeight() {return weight;}

}
