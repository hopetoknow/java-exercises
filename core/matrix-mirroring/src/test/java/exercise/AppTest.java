package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testGetMirrorMatrix1() {
        int[][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66},
        };

        int[][] expected = {
                {11, 12, 13, 13, 12, 11},
                {21, 22, 23, 23, 22, 21},
                {31, 32, 33, 33, 32, 31},
                {41, 42, 43, 43, 42, 41},
                {51, 52, 53, 53, 52, 51},
                {61, 62, 63, 63, 62, 61},
        };

        assertThat(App.getMirrorMatrix(matrix)).isDeepEqualTo(expected);
    }

    @Test
    public void testGetMirrorMatrix2() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},

        };

        int[][] expected = {
                {1, 2, 2, 1},
                {5, 6, 6, 5},
                {9, 10, 10, 9 },
                {13, 14, 14, 13},

        };

        assertThat(App.getMirrorMatrix(matrix)).isDeepEqualTo(expected);
    }
}
