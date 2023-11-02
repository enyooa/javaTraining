package javaTraining.string.stringFormate;

public class Test {
    public static void main(String[] args) {
        String name = "Дамир";
        int age = 36;
        System.out.printf("Meня зовут %s, мне %d лет\n\n", name, age);


        double number = 3.1444;
        System.out.printf("число пи=%.2f\n", number);
        System.out.println("text");

        String name1  = "beka";
        String name2  = "amanzhol";
        String name3  = "bartolonmough";

        System.out.println(name3.length());

        System.out.printf("%-13s %d\n", name1, 19);
        System.out.printf("%-13s %d\n", name2, 20);
        System.out.printf("%-13s %d\n", name3, 45);

    }
}
