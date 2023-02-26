package exercise;

public class App {

    public static int getFibonacciNumber(int ordinalNumber) {
        if (ordinalNumber <= 1) {
            return ordinalNumber;
        }

        return getFibonacciNumber(ordinalNumber - 1) + getFibonacciNumber(ordinalNumber - 2);
    }

    public static int getFibonacciNumber2(int ordinalNumber) {
        if (ordinalNumber <= 1) {
            return ordinalNumber;
        }

        int first = 0;
        int second = 1;
        int result = first + second;
        int index = 2;

        while (index <= ordinalNumber) {
            result = first + second;
            first = second;
            second = result;
            index++;
        }

        return result;
    }
}