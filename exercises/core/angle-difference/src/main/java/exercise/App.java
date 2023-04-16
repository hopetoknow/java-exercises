package exercise;

public class App {

    public static int getDifference(int firstAngle, int secongAngle) {
        int result = Math.abs(firstAngle - secongAngle);
        return Math.min(result, 360 - result);
    }
}