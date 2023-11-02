package javaTraining.string.stringBuilder;

public class Test_2 {
    public static void main(String[] args) {
        String month = "Месяца: ";
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        StringBuilder builder = new StringBuilder(month);
        builder.append("Зима(");
        builder.append(months[0]).append("-");
        builder.append(months[1]).append("-");
        builder.append(months[months.length - 1]).append(") ");

        builder.append("Весна(");
        for (int i = 2; i < 5; i++) {
            builder.append(months[i]).append("-");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(") ");

        builder.append("Лето(");
        for (int i = 5; i < 8; i++) {
            builder.append(months[i]).append("-");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(") ");

        builder.append("Осень(");
        for (int i = 8; i < 11; i++) {
            builder.append(months[i]).append("-");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(")");

        System.out.println(builder);
    }
}
