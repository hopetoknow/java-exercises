package exercise;

import java.util.List;

public class App {

    public static int findIndexOfClosest(List<Integer> numbers, int desiredNumber) {
        int result = -1;
        int diff;
        int prevDiff;

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                result = 0;
                continue;
            }

            prevDiff = Math.abs(numbers.get(i - 1) - desiredNumber);
            diff = Math.abs(numbers.get(i) - desiredNumber);


            if (diff < prevDiff) {
                result = i;
            }
        }

        return result;
    }
}