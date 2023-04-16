package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testMergeSort() {
        int[] array = {340, 178, 13, 56, 25, 150, -13, 250, 7};
        int[] expected = {-13, 7, 13, 25, 56, 150, 178, 250, 340};

        App.mergeSort(array);
        assertThat(array).isEqualTo(expected);
    }
}
