package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testMergeArrays() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] expectedArr3 = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] actualArr3 = App.mergeArrays(arr1, arr2);
        assertThat(actualArr3).isEqualTo(expectedArr3);
    }

    @Test
    void testMergeArraysWhenOneArrayIsEmpty() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {};
        int[] expectedArr3 = {1, 3, 5, 7};

        int[] actualArr3 = App.mergeArrays(arr1, arr2);
        assertThat(actualArr3).isEqualTo(expectedArr3);
    }
}
