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

    @Test
    public void testMultiplyMatrix3() {
        int[][] matrixA = {
                {1, 2, 1},
                {0, 1, 0},
                {2, 3, 4},
        };
        int[][] matrixB = {
                {2, 5},
                {6, 7},
                {1, 8},
        };
        int[][] expected = {
                {15, 27},
                {6, 7},
                {26, 63},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    public void testMultiplyMatrix4() {
        int[][] matrixA = {
                {2, 5},
                {6, 7},
                {1, 8},
        };
        int[][] matrixB = {
                {1, 2, 1},
                {0, 1, 0},
        };
        int[][] expected = {
                {2, 9, 2},
                {6, 19, 6},
                {1, 10, 1},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    public void testMultiplyMatrix5() {
        int[][] matrixA = {
                {2},
        };
        int[][] matrixB = {
                {3},
        };
        int[][] expected = {
                {6},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    public void testMultiplyMatrix6() {
        int[][] matrixA = {
                {1},
                {2},
        };
        int[][] matrixB = {
                {10, 20},
        };
        int[][] expected = {
                {10, 20},
                {20, 40},
        };

        var actual = App.multiply(matrixA, matrixB);
        assertThat(actual).isDeepEqualTo(expected);
    }
}
