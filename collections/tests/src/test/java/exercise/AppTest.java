package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> actual = App.take(numbers, 2);
        Assertions.assertEquals(actual, expected);
        // END
    }

    @Test
    void testTakeWithCountGreaterThanListSize() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = App.take(numbers, 10);
        Assertions.assertEquals(actual, expected);
        // END
    }

    @Test
    void testTakeWithEmptyList() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = App.take(numbers, 3);
        Assertions.assertEquals(actual, expected);
        // END
    }
}
