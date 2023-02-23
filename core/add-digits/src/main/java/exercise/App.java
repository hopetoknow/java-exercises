package exercise;

public class App {

    public static int addDigits(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        if (result > 9) {
            result = addDigits(result);
        }

        return result;
    }
}