package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AppTest {

    @Test
    void testProbabilitiesEmpty() {
        assertThat(App.calculateProbabilities(new ArrayList<Integer>()))
                .isEqualTo(new HashMap<Integer, Map<Integer, Double>>());
    }

    @Test
    void testProbabilities1() {
        List<Integer> numbers = List.of(1, 3, 1, 5, 1);
        Map<Integer, Map<Integer, Double>> expected = Map.of(
                1, Map.of(3, 0.5, 5, 0.5),
                3, Map.of(1, 1.0),
                5, Map.of(1, 1.0)
        );

        assertThat(App.calculateProbabilities(numbers)).isEqualTo(expected);
    }

    @Test
    void testProbabilities2() {
        List<Integer> numbers = List.of(1, 3, 1, 5, 1, 2, 1, 6);
        Map<Integer, Map<Integer, Double>> expected = Map.of(
                1, Map.of(2, 0.25, 3, 0.25, 5, 0.25, 6, 0.25),
                2, Map.of(1, 1.0),
                3, Map.of(1, 1.0),
                5, Map.of(1, 1.0),
                6, Map.of()
        );

        assertThat(App.calculateProbabilities(numbers)).isEqualTo(expected);
    }

    @Test
    void testProbabilities3() {
        List<Integer> numbers = List.of(2, 3, 2, 5, 2, 2, 1, 3);
        Map<Integer, Map<Integer, Double>> expected = Map.of(
                1, Map.of(3, 1.0),
                2, Map.of(1, 0.25, 2, 0.25, 3, 0.25, 5, 0.25),
                3, Map.of(2, 1.0),
                5, Map.of(2, 1.0)
        );

        assertThat(App.calculateProbabilities(numbers)).isEqualTo(expected);
    }

    @Test
    void testProbabilities4() {
        List<Integer> numbers = List.of(1, 3, 1, 5, 1, 2, 1, 6, 1, 3);
        Map<Integer, Map<Integer, Double>> expected = Map.of(
                1, Map.of(2, 0.2, 3, 0.4, 5, 0.2, 6, 0.2),
                2, Map.of(1, 1.0),
                3, Map.of(1, 1.0),
                5, Map.of(1, 1.0),
                6, Map.of(1, 1.0)
        );

        assertThat(App.calculateProbabilities(numbers)).isEqualTo(expected);
    }
}
