package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testRotateMatrix1() {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 0, 1, 2},
                {3, 4, 5, 6, 7, 8},
                {9, 0, 1, 2, 3, 4},
        };
        int[][] expectedLeft = {
                {6, 2, 8, 4},
                {5, 1, 7, 3},
                {4, 0, 6, 2},
                {3, 9, 5, 1},
                {2, 8, 4, 0},
                {1, 7, 3, 9},
        };
        int[][] expectedRight = {
                {9, 3, 7, 1},
                {0, 4, 8, 2},
                {1, 5, 9, 3},
                {2, 6, 0, 4},
                {3, 7, 1, 5},
                {4, 8, 2, 6},
        };

        assertThat(App.rotateLeft(matrix)).isDeepEqualTo(expectedLeft);
        assertThat(App.rotateRight(matrix)).isDeepEqualTo(expectedRight);
    }

    @Test
    public void testGetMirrorMatrix2() {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
        };
        int[][] expectedLeft = {
                {6},
                {5},
                {4},
                {3},
                {2},
                {1},
        };
        int[][] expectedRight = {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
        };

        assertThat(App.rotateLeft(matrix)).isDeepEqualTo(expectedLeft);
        assertThat(App.rotateRight(matrix)).isDeepEqualTo(expectedRight);
    }

    @Test
    public void testGetMirrorMatrix3() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
        };
        int[][] expectedLeft = {
                {1, 2, 3, 4, 5, 6}
        };
        int[][] expectedRight = {
                {6, 5, 4, 3, 2, 1},
        };

        assertThat(App.rotateLeft(matrix)).isDeepEqualTo(expectedLeft);
        assertThat(App.rotateRight(matrix)).isDeepEqualTo(expectedRight);
    }
}

