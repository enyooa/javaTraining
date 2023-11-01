package javaTraining.arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        int[] result = getPair(numbers);
        System.out.println(result.length);

        int a = 9;
        int b = 1;
        System.out.println(getPair2(a, b).length);

    }
    static int[] getPair(int[] numbers) {
        return numbers;
    }

    static int[] getPair2(int a, int b) {
        int[] arr = {1, 2, a, 3, b};
        return arr;
    }
}
