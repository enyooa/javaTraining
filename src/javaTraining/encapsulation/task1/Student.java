package javaTraining.encapsulation.task1;

public class Student {
    private String name;
    private int age;
    private double score;

    //сеттеры
    public void setName(String name) {
        this.name = name;

        boolean isDigit = true;
        for (int i = 0; i < name.length(); i++) {
            if (name.equals("&") || name.equals("{") || name.equals("[") || name.equals("}") || name.equals("]") || name.equals(")") || name.equals("(")) {
                System.out.println("Вы ввели запрещенный символ!");
                break;
            } else if (name.equals("черт") || name.equals("лох")) {
                System.out.println("как вам не стыдно!");
                break;
            }
            if (!Character.isDigit(name.charAt(i))) {
                isDigit = false;
            }
            if (isDigit) {
                System.out.println("Имя не может быть числом");
                break;
            } else {
                System.out.println("Здравствуйте " + name);
                break;
            }
        }
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 15 || 27 < age) {
            System.out.println("У вас неподходящий возраст для набора студентов, возраст должен быть от 17 до 26 лет");
        }
    }

    public void setScore(double score) {
        this.score = score;
        if (score < 1 || 10 < score) {
            System.out.println("Вы ввели не коректный бал студенту, введите бал от 1 до 10");
        }
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}
