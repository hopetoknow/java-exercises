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

    public static String nrzi2(String signal) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < signal.length(); i++) {
            if (signal.charAt(i) == '|') {
                continue;
            }

            if (i != 0 && signal.charAt(i - 1) == '|') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        return sb.toString();
    }
}
