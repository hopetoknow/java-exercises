package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testRearrangePositiveAndNegativeNumbers() {
        int[] arr = {-25, 12, -20, -42, 6, -7, 15, -10, -2};
        int[] expected = {-25, -20, -42, -7, -10, -2, 12, 6, 15};

        App.rearrangePositiveAndNegativeNumbers(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void testRearrangePositiveAndNegativeNumbers2() {
        int[] arr = {25, -12, -20, -42, 6, 7, 15, -10, -2};
        int[] expected = {-12, -20, -42, -10, -2, 25, 6, 7, 15};

        App.rearrangePositiveAndNegativeNumbers(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void testRearrangePositiveAndNegativeNumbers3() {
        int[] arr = {-25, -20, -42, -42, -6, 7, 15, 10, 2};
        int[] expected = {-25, -20, -42, -42, -6, 7, 15, 10, 2};

        App.rearrangePositiveAndNegativeNumbers(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void testRearrangePositiveAndNegativeNumbers4() {
        int[] arr = {25, 20, 42, 42, 6, -7, -15, -10, -2};
        int[] expected = {-7, -15, -10, -2, 25, 20, 42, 42, 6};

        App.rearrangePositiveAndNegativeNumbers(arr);
        assertThat(arr).isEqualTo(expected);
    }
}
