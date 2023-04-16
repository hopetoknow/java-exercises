package exercise;

public class App {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] result = new int[arr1Length + arr2Length];
        int i = 0, j = 0, k = 0;

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1Length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2Length) {
            result[k++] = arr2[j++];
        }
        return result;
    }
}
