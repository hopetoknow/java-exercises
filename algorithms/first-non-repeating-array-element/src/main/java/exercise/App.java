package exercise;

public class App {

    public static int firstNonRepeating(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int j;

            for (j = 0; j < length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }

            if (j == length) {
                return arr[i];
            }
        }
        return -1;
    }
}
