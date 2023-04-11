package exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class App {

    public static String rgbToHex(int r, int g, int b) {
        String hex = Stream.of(r, g, b)
                .map(channel -> Integer.toString(channel, 16))
                .map(channel -> leftPad(channel, 2, "0"))
                .collect(Collectors.joining(""));

        return String.format("#%s", hex);
    }

    public static String leftPad(String str, int size, String padStr) {
        if (str == null) {
            return null;
        }

        if (padStr == null || padStr.isEmpty()) {
            padStr = " ";
        }

        int strLength = str.length();

        if (strLength >= size) {
            return str;
        }

        int padLength = size - strLength;
        StringBuilder sb = new StringBuilder();

        while (sb.length() < padLength) {
            sb.append(padStr);
        }

        if (sb.length() > padLength) {
            sb.setLength(padLength);
        }

        sb.append(str);
        return sb.toString();
    }

    public static String[] chunk(String text, int chunkSize) {
        return text.split("(?<=\\G.{" + chunkSize + "})");
    }
}
