package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testSum() {
        int[] array = {-5, 100, 1, 2, 0, 2};
        int expected = 100;

        int actual = App.sum(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSumWhenArrayEmpty() {
        int[] array = {};
        int expected = 0;

        int actual = App.sum(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSize() {
        int[] array = {-5, 100, 1, 2, 0, 2};
        int expected = 6;

        int actual = App.size(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSizeWhenArrayEmpty() {
        int[] array = {};
        int expected = 0;

        int actual = App.size(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSizeWhenSizeOne() {
        int[] array = {42};
        int expected = 1;

        int actual = App.size(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testMax() {
        int[] array = {240, 178, 13, 56, 255, 150, -13, 250, 7};
        int expected = 255;

        int actual = App.max(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testMaxWhenSizeOne() {
        int[] array = {7};
        int expected = 7;

        int actual = App.max(array);
        assertThat(actual).isEqualTo(expected);
    }
}
