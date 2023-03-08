package exercise;

public class App {

    public static int[] generate(int rowNumber) {
        var result = new int[rowNumber + 1];

        for (int i = 0; i < rowNumber + 1; i++) {
            result[i] = factorial(rowNumber) / (factorial(i) * factorial(rowNumber - i));
        }

        return result;
    }

    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}