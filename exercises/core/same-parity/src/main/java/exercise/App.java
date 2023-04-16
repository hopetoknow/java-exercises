package exercise;

import java.util.ArrayList;
import java.util.List;

class App {

    public static List<Integer> sameParityFilter(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        boolean firstElementParity = isEven(numbers.get(0));
        return numbers.stream()
                .filter(number -> isEven(number) == firstElementParity)
                .toList();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
