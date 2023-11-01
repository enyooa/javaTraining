package javaTraining.enums.пример_с_енамом;

public class Main {
    public static void main(String[] args) {
        Season season = initSeason(3);
        System.out.println(season.getRusName());
    }

//    1, 2, 12 - winter
//    3, 4, 5 - spring
//    6, 7, 8 - summer
//    9, 10, 11 - autumn
    static Season initSeason(int numberOfMonth){
        if (numberOfMonth >= 1 && numberOfMonth <=2 || numberOfMonth == 12){
            return Season.WINTER;
        } else if (numberOfMonth >= 3 && numberOfMonth <= 5) {
            return Season.SPRING;
        } else if (numberOfMonth >= 6 && numberOfMonth <= 8) {
            return Season.SUMMER;
        } else if (numberOfMonth >= 9 && numberOfMonth <= 11) {
            return Season.AUTUMN;
        } else {
            return Season.UNKNOWN;
        }
    }
}