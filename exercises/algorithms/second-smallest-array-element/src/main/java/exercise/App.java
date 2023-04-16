package exercise;

public class App {

    public static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element < smallest) {
                secondSmallest = smallest;
                smallest = element;
            } else if (element < secondSmallest && element != smallest) {
                secondSmallest = element;
            }
        }

        if (secondSmallest != Integer.MAX_VALUE) {
            return secondSmallest;
        }
        return -1;
    }
}
