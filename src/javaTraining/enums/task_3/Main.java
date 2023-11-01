package javaTraining.enums.task_3;

public class Main {
    public static void main(String[] args) {
       Country[] country = Country.values();
        System.out.println(country[2].getCurrency().toLowerCase());

//        for (Country country : Country.values()) {
//            System.out.println(country + " : " + country.getCurrency());
//        }
    }
}
