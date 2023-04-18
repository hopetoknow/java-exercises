package exercise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static String nrzi(String signal) {
        return IntStream.range(0, signal.length())
                .mapToObj(index -> {
                    if (signal.charAt(index) == '|') {
                        return "";
                    }
                    return (index != 0 && signal.charAt(index - 1) == '|') ? "1" : "0";
                })
                .collect(Collectors.joining(""));
    }
}
