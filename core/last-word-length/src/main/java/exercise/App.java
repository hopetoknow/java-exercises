package exercise;

public class App {

    public static int getLastWordLength(String str) {
        String[] words = str.trim().split(" ");
        String lastWord = words[words.length - 1];

        return lastWord.length();
    }
}