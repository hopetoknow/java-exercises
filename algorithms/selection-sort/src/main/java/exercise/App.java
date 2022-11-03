package exercise;

public class App {

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int smallestElementIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[smallestElementIndex]) {
                    smallestElementIndex = j;
                }
            }

            if (smallestElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestElementIndex];
                arr[smallestElementIndex] = temp;
            }
        }
    }
}