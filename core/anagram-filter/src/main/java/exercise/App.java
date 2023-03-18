package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class App {

    public static List<String> filterAnagram(String word, List<String> words) {
        String sortedWord = getSortedWord(word);
        return words.stream()
                .filter(item -> sortedWord.equals(getSortedWord(item)))
                .toList();
    }

    private static String getSortedWord(String word) {
        return Stream.of(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}