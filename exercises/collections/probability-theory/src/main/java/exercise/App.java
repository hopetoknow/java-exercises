package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

            if (!innerMap.containsKey(nextNumber)) {
                innerMap.put(nextNumber, 1.0);
            } else {
                innerMap.put(nextNumber, innerMap.get(nextNumber) + 1.0);
            }
        }

        for (Map.Entry<Integer, Map<Integer, Double>> entry : probabilities.entrySet()) {
            Map<Integer, Double> innerMap = entry.getValue();
            double sum = innerMap.values().stream().mapToDouble(Double::doubleValue).sum();

            for (Map.Entry<Integer, Double> innerEntry : innerMap.entrySet()) {
                int number = innerEntry.getKey();
                double occurrenceCount  = innerEntry.getValue();
                double probability = occurrenceCount / sum;
                innerMap.put(number, probability);
            }
        }

        return probabilities;
    }
}
