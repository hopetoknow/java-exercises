package exercise;

public class App {

    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}