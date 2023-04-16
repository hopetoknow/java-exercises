package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testQuickSort() {
        int[] array = {340, 178, 13, 56, 25, 150, 30, 250, 7};
        int[] expected = {7, 13, 25, 30, 56, 150, 178, 250, 340};

        App.quickSort(array, 0, array.length - 1);
        assertThat(array).isEqualTo(expected);
    }
}
