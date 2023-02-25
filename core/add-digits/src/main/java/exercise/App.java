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

    public static int addDigits2(int number) {
        int result = number;

        while (!isOneDigitNumber(result)) {
            result = sumDigits(result);
        }

        return result;
    }

    private static int sumDigits(int number) {
        String numberAsString = Integer.toString(number);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            String digitAsString = Character.toString(numberAsString.charAt(i));
            int digit = Integer.parseInt(digitAsString);
            result += digit;
        }

        return result;
    }

    private static boolean isOneDigitNumber(int number) {
        return number < 10;
    }
}