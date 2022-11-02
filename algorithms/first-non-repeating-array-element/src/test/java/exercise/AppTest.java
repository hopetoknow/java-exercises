package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testFirstNonRepeating() {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 6};
        int expected = 4;

        int actual = App.firstNonRepeating(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFirstNonRepeatingWhenRepeatingOnly() {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        int expected = -1;

        int actual = App.firstNonRepeating(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFirstNonRepeating2() {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 6, 1, 2, 3, 10};
        int expected = 4;

        int actual = App.firstNonRepeating2(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFirstNonRepeatingWhenRepeatingOnly2() {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2, 3, 4};
        int expected = -1;

        int actual = App.firstNonRepeating2(arr);
        assertThat(actual).isEqualTo(expected);
    }
}
