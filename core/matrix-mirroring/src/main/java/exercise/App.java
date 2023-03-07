package exercise;

public class App {

    public static int[][] getMirrorMatrix(int[][] matrix) {
        int length = matrix.length;
        var mirroredMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            mirroredMatrix[i] = matrix[i];
            for (int j = 0; j < length / 2; j++) {
                mirroredMatrix[i][length - j - 1] = matrix[i][j];
            }
        }

        return mirroredMatrix;
    }
}