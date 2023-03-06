package exercise;

import java.util.Arrays;

public class App {

    public static String[][] chunk(String[] words, int chunkSize) {
        int wordCount = words.length;
        int chunkCount = (int) Math.ceil((double) wordCount / chunkSize);
        String[][] result = new String[chunkCount][0];
        int chunkElementsCounter = 0;
        int upperBound;

        for (int i = 0; i < chunkCount; i++) {
            upperBound = Math.min(chunkElementsCounter + chunkSize, wordCount);
            result[i] = Arrays.copyOfRange(words, chunkElementsCounter, upperBound);
            chunkElementsCounter += chunkSize;
        }

        return result;
    }
}