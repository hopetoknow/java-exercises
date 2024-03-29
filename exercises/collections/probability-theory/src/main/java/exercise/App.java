package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static Map<Integer, Map<Integer, Double>> calculateProbabilities(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return Map.of();
        }

        Map<Integer, Map<Integer, Double>> probabilities = new HashMap<>();

        for (Integer number : numbers) {
            probabilities.putIfAbsent(number, new HashMap<>());
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNumber = numbers.get(i);
            int nextNumber = numbers.get(i + 1);

            Map<Integer, Double> innerMap = probabilities.get(currentNumber);
            double occurrenceCount = innerMap.getOrDefault(nextNumber, 0.0) + 1.0;
            innerMap.put(nextNumber, occurrenceCount);
        }

        for (Map.Entry<Integer, Map<Integer, Double>> entry : probabilities.entrySet()) {
            Map<Integer, Double> innerMap = entry.getValue();
            double sumOfOccurrence = innerMap.values().stream().mapToDouble(Double::doubleValue).sum();

            for (Map.Entry<Integer, Double> innerEntry : innerMap.entrySet()) {
                int number = innerEntry.getKey();
                double occurrenceCount  = innerEntry.getValue();
                double probability = occurrenceCount / sumOfOccurrence;
                innerMap.put(number, probability);
            }
        }

        return probabilities;
    }

    public static Map<Integer, Map<Integer, Double>> calculateProbabilities2(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Function.identity(),
                        number -> findProbabilityOfNextNumbers(numbers, number)
                ));
    }

    private static Map<Integer, Double> findProbabilityOfNextNumbers(List<Integer> numbers, int number) {
        List<Integer> nextNumbers = IntStream.range(1, numbers.size())
                .filter(index -> numbers.get(index - 1) == number)
                .mapToObj(numbers::get)
                .toList();

        return nextNumbers.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Function.identity(),
                        element ->  (double) countElements(nextNumbers, element) / nextNumbers.size()
                ));
    }

    private static long countElements(List<Integer> elements, int element) {
        return elements.stream()
                .filter(currentElement -> currentElement == element)
                .count();
    }
}
