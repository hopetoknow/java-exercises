package exercise;

public class App {

    public static boolean isContinuousSequence(int[] arr) {
        int arrLength = arr.length;

        if (arrLength <= 1) {
            return false;
        }

        for (int i = 1; i < arrLength; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                return false;
            }
        }

        return true;
    }
}