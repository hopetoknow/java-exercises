package exercise;

import java.util.List;

public class App {

    public static int findIndexOfClosest(List<Integer> numbers, int desiredNumber) {
        if (numbers.isEmpty()) {
            return -1;
        }

        List<Integer> diffs = numbers.stream()
                .map(number -> Math.abs(number - desiredNumber))
                .toList();

        int minDiff = diffs.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        return diffs.indexOf(minDiff);
    }

    public static int findIndexOfClosest2(List<Integer> numbers, int desiredNumber) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int result = 0;
        int prevDiff = Math.abs(numbers.get(0) - desiredNumber);
        int currentDiff;

        for (int i = 1; i < numbers.size(); i++) {
            currentDiff = Math.abs(numbers.get(i) - desiredNumber);

            if (currentDiff < prevDiff) {
                result = i;
                prevDiff = currentDiff;
            }
        }

        return result;
    }
}
