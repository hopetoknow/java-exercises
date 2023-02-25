package exercise;

public class App {

    public static int getFibonacciNumber(int ordinalNumber) {
        if (ordinalNumber <= 1) {
            return ordinalNumber;
        }

        return getFibonacciNumber(ordinalNumber - 1) + getFibonacciNumber(ordinalNumber - 2);
    }
}