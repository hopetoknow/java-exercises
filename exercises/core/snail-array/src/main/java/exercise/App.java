package exercise;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class App {

    public static int[] buildSnailPath(int[][] matrix) {
        int rowNumber = matrix.length;

        if (rowNumber == 0) {
            return new int[0];
        }

        int[] head = matrix[0];
        int[][] tail = Arrays.copyOfRange(matrix, 1, rowNumber);

        int[][] result = {
            head,
            buildSnailPath(rotate(tail))
        };

        return flatten(result);
    }

    private static int[][] rotate(int[][] matrix) {
        int rowNumber = matrix.length;

        if (rowNumber == 0) {
            return new int[0][];
        }

        int columnNumber = matrix[0].length;
        int[][] result = new int[columnNumber][rowNumber];

        for (int i = 0; i < columnNumber; i++) {
            for (int j = 0; j < rowNumber; j++) {
                result[i][j] = matrix[j][columnNumber - i - 1];
            }
        }

        return result;
    }

    private static int[] flatten(int[][] items) {
        return Stream.of(items)
                .flatMapToInt(IntStream::of)
                .toArray();
    }
}
