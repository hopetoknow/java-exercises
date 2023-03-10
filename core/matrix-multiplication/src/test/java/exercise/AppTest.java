package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testMultiplyMatrix1() {
        int[][] matrixA = {
                {1, 2},
                {3, 2},
        };
        int[][] matrixB = {
                {3, 2},
                {1, 1},
        };
        int[][] expected = {
                {5, 4},
                {11, 8},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    public void testMultiplyMatrix2() {
        int[][] matrixA = {
                {3, 2},
                {1, 1},
        };
        int[][] matrixB = {
                {1, 2},
                {3, 2},
        };
        int[][] expected = {
                {9, 10},
                {4, 4},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }
}
