package exercise;

import java.util.Arrays;

public class App {

    public static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int size(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return 1 + size(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int max(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int subMax = max(Arrays.copyOfRange(array, 1, array.length));
        return Math.max(array[0], subMax);
    }
}