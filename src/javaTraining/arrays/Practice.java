package javaTraining.arrays;

public class Practice {
    public static void main(String[] args) {
        int[] numbers = {7, 2, -3, 9, -2, -1, 2, 4};

        int positive_counter = 0;
        int negative_counter = 0;

        int positiveSum = 0;
        int negativeSum = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (0 < numbers[i]) {
                positive_counter = positive_counter + 1; // пример инкремента
            }
            if (0 > numbers[i]) {
                negative_counter +=1;
            }

            if (0 < numbers[i]) {
                positiveSum += numbers[i];
            }
            if (0 > numbers[i]) {
                negativeSum += numbers[i];
            }
        }
        System.out.println("Длина массива: " + numbers.length);
        System.out.println();
        System.out.println("Количество положительных чисел: " + positive_counter);
        System.out.println("Количество отрицательных чисел: " + negative_counter);
        System.out.println();
        System.out.println("Сумма положительных чисел: " + positiveSum);
        System.out.println("Сумма отрицательных чисел: " + negativeSum);
    }
}
