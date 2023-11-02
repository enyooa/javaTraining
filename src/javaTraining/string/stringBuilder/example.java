package javaTraining.string.stringBuilder;

public class example {
    public static void main(String[] args) {
        String month = "Месяца: ";
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        StringBuilder stringBuilder = new StringBuilder(month);
        for (String s : months) {
            stringBuilder.append(s).append('-');
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append(stringBuilder.substring(1,7)).append("зима");

//        Домашняя задача
//        Месяца: Зима(January-February) Весна(March-April-May) Лето(June-July-August) Осень(September-October-November) Зима(December)

        month = stringBuilder.toString();
        System.out.println(month);

    }
}

