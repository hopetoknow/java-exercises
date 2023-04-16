package exercise;

public class App {

    public static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix) {
        int firstMatrixRowNumber = firstMatrix.length;
        int secondMatrixColumnNumber = secondMatrix[0].length;
        int firstMatrixColumnNumber = firstMatrix[0].length;
        int[][] result = new int[firstMatrixRowNumber][secondMatrixColumnNumber];

        for (int i = 0; i < firstMatrixRowNumber; i++) {
            for (int j = 0; j < secondMatrixColumnNumber; j++) {
                int sum = 0;
                for (int k = 0; k < firstMatrixColumnNumber; k++) {
                    sum += firstMatrix[i][k] * secondMatrix[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}