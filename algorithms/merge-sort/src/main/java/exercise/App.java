package exercise;

import java.util.Arrays;

public class App {

    public static void mergeSort(int[] array) {
        var length = array.length;

        if (length <= 1) {
            return;
        }

        var middleIndex = length / 2;

        var left = Arrays.copyOfRange(array, 0, middleIndex);
        var right = Arrays.copyOfRange(array, middleIndex, length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right, left.length, right.length);
    }

    private static void merge(int[] array, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;

        while (j < leftLength && k < rightLength) {
            if (left[j] < right[k]) {
                array[i++] = left[j++];
            } else {
                array[i++] = right[k++];
            }
        }

        while (j < leftLength) {
            array[i++] = left[j++];
        }

        while (k < rightLength) {
            array[i++] = right[k++];
        }
    }
}