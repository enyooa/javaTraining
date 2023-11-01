package javaTraining.enums.пример_без_енама;

public class Main {
    final static Season WINTER = new Season("Winter");
    final static Season SPRING = new Season("Spring");
    final static Season SUMMER = new Season("Summer");
    final static Season AUTUMN = new Season("Autumn");

    public static void main(String[] args) {
        Season[] seasons = {WINTER, SPRING, SUMMER, AUTUMN};

        for (Season season : seasons) {
            System.out.println(season.getName());
        }
    }
}
