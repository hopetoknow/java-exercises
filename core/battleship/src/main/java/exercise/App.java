package exercise;

class App {

    public static int calculateShipCount(int[][] field) {
        int fieldSize = field.length;
        int counter = 0;

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (field[i][j] == 1) {
                    if (i == 0 || field[i - 1][j] == 0) {
                        if (j == 0 || field[i][j - 1] == 0) {
                            counter++;
                        }
                    }
                }
            }
        }

        return counter;
    }

    public static boolean isValidField(int[][] field) {
        int fieldSize = field.length;

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize - 1; j++) {
                if (i % 2 == 0) {
                    if (field[i][j] == 1 && field[i + 1][j + 1] == 1) {
                        return false;
                    }
                } else {
                    if (field[i][j] == 1 && field[i - 1][j + 1] == 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
