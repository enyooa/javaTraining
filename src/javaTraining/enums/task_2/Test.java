package javaTraining.enums.task_2;

public class Test {
    public static void main(String[] args) {

        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();

        veryStrictDiet.takeLunch(dayOfWeek);
    }
}
