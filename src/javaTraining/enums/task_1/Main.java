package javaTraining.enums.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
       System.out.println(dayOfWeeks[1].getDisplayName());
        System.out.println();
        System.out.println(Arrays.toString(dayOfWeeks));
        System.out.println();
        int counter = 1;
        for (DayOfWeek dayOfWeek : dayOfWeeks) {
            System.out.println(counter + " " + dayOfWeek + " " + dayOfWeek.getDisplayName() + " " + dayOfWeek.getShortName());
            counter++;
        }
    }
}