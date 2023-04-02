package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testBuildSnailPath1() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {1, 2, 4, 3};
        int[] actual = App.buildSnailPath(matrix);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void testBuildSnailPath2() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] expected = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        int[] actual = App.buildSnailPath(matrix);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void testBuildSnailPath3() {
        int[][] matrix = {};
        int[] expected = {};
        int[] actual = App.buildSnailPath(matrix);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void testBuildSnailPath4() {
        int[][] matrix = {{1, 2, 3, 4}};
        int[] expected = {1, 2, 3, 4};
        int[] actual = App.buildSnailPath(matrix);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void testBuildSnailPath5() {
        int[][] matrix = {{1}, {2}, {3}, {4}};
        int[] expected = {1, 2, 3, 4};
        int[] actual = App.buildSnailPath(matrix);
        assertThat(actual).containsExactly(expected);
    }
}
