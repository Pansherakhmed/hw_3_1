import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {13, 34, 56, 75, 43, 23, -45, 96, -56, -65, -44, 45, 10, -10, 5};
        boolean firstNegativeNum = false;
        double sum = 0;
        for (double i : numbers) {
            if (i < 0) {
                firstNegativeNum = true;
                continue;
            }
            if (firstNegativeNum) {
                sum += i;
            }
        }
        System.out.println(sum / numbers.length);


        boolean sort = false;
        double result;
        while (!sort) {
            sort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sort = false;
                    result = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = result;
                    System.out.println(Arrays.toString(numbers));
                }

            }
        }
    }
}