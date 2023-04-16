package exercise;

public class App {

    public static void rearrangePositiveAndNegativeNumbers(int[] arr) {
        int j, temp;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];

            if (temp > 0) {
                continue;
            }

            j = i - 1;

            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}