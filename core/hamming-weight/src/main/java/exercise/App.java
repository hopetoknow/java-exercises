package exercise;

public class App {

    public static int getHammingWeight(int number) {
        int result = 0;

        while (number > 0) {
            if (number % 2 != 0) {
                result++;
            }
            number /= 2;
        }

        return result;
    }

    public static int getHammingWeight2(int number) {
        int result = 0;

        while (number != 0) {
            number = number & (number - 1);
            result++;
        }

        return result;
    }
}