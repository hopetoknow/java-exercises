package exercise;

import java.util.HashMap;
import java.util.Map;

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

    public static int firstNonRepeating2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : arr) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int element : arr) {
            if (map.get(element) == 1) {
                return element;
            }
        }
        return -1;
    }
}
