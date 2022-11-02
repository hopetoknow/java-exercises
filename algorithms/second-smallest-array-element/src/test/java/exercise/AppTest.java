package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testSecondSmallest() {
        int[] arr = {42, 23, 16, 4, 8, 15};
        int expected = 8;

        int actual = App.secondSmallest(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSecondSmallestWithNegativeNumbers() {
        int[] arr = {42, -23, 16, -4, -8, 15};
        int expected = -8;

        int actual = App.secondSmallest(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSecondSmallestWithIntegerMaxValue() {
        int[] arr = {1, Integer.MAX_VALUE};
        int expected = -1;

        int actual = App.secondSmallest(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSecondSmallestWhenNoSecondSmallest() {
        int[] arr = {42, 42, 42, 42, 42, 42, 42, 42};
        int expected = -1;

        int actual = App.secondSmallest(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSecondSmallestWhenNoSecondSmallest2() {
        int[] arr = {42};
        int expected = -1;

        int actual = App.secondSmallest(arr);
        assertThat(actual).isEqualTo(expected);
    }
}
