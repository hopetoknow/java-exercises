package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testBinarySearch() {
        int[] array = {3, 7, 13, 25, 56, 150, 178, 250, 340};
        int number = 7;
        int expected = 1;

        int actual = App.binarySearch(array, number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testBinarySearchWhenNegativeNumbers() {
        int[] array = {-60, -54, -23, -15, 0, 1, 4, 8};
        int number = 0;
        int expected = 4;

        int actual = App.binarySearch(array, number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testBinarySearchWhenNoNumber() {
        int[] array = {-61, -34, -30, -5, -3, 0, 13, 42};
        int number = 100;
        int expected = -1;

        int actual = App.binarySearch(array, number);
        assertThat(actual).isEqualTo(expected);
    }
}
