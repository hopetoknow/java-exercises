package exercise;

public class App {

    public static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int index = (low + high) / 2;

            if (number == arr[index]) {
                return index;
            } else if (number < arr[index]) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return -1;
    }
}