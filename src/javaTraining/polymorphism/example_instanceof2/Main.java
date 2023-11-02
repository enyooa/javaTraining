package javaTraining.polymorphism.example_instanceof2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество фильма");
        int size = Integer.parseInt(sc.nextLine());
        MediaItem[] mediaItems = new MediaItem[size];

        for (int i = 0; i < mediaItems.length; i++) {
            System.out.println("1. Добавить фильм");
            System.out.println("2. Добавить сериал");
            int command = Integer.parseInt(sc.nextLine());
            if (command == 1) {
                Movie movie = new Movie();

                System.out.println("Введите название фильма: ");
                String title = sc.nextLine();
                movie.setTitle(title);

                System.out.println("Введите продолжительность фильма: ");
                int runtime = Integer.parseInt(sc.nextLine());
                movie.setRuntime(runtime);
                mediaItems[i] = movie;

            } else if (command == 2) {
                Series series = new Series();

                System.out.println("Введите название сериала: ");
                String title = sc.nextLine();
                series.setTitle(title);

                System.out.println("Введите продолжительность сериала: ");
                int runtime = Integer.parseInt(sc.nextLine());
                series.setRuntime(runtime);

                System.out.println("Введите колличество серии: ");
                int seriesCount = Integer.parseInt(sc.nextLine());
                series.setSeriesCount(seriesCount);
                mediaItems[i] = series;
            } else if (command >= 1 && command <= mediaItems.length) {
                mediaItems[command - 1].getRuntime();
                mediaItems[command - 1].getTitle();
            } else {
                System.out.println("Такой команды нет");
            }
        }

        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
                System.out.println();
                System.out.println("Название серала: " + mediaItem.getTitle() + "\nПродолжительность сериала: " + mediaItem.getRuntime() + "\nКолличество серии: " + series.getSeriesCount());
            } else if (mediaItem instanceof Movie) {
                System.out.println();
                System.out.println("Название фильма: " + mediaItem.getTitle() + "\nПродолжительность фильма: " + mediaItem.getRuntime());
            }
        }
    }
}