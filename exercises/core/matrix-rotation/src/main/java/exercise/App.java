package exercise;

class App {

    public static int[][] rotateLeft(int[][] matrix) {
        return rotate(matrix, "left");
    }

    public static int[][] rotateRight(int[][] matrix) {
        return rotate(matrix, "right");
    }

    private static int[][] rotate(int[][] matrix, String direction) {
        int rowNumber = matrix.length;
        int columnNumber = matrix[0].length;
        int[][] result = new int[columnNumber][rowNumber];

        for (int i = 0; i < columnNumber; i++) {
            for (int j = 0; j < rowNumber; j++) {
                if ("left".equals(direction)) {
                    result[i][j] = matrix[j][columnNumber - i - 1];
                } else {
                    result[i][j] = matrix[rowNumber - j - 1][i];
                }
            }
        }

        return result;
    }
}