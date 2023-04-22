package exercise;

import java.util.stream.IntStream;

class App {

    public static long ipToDecimal(String ip) {
        String[] octets = ip.split("\\.");

        return IntStream.range(0, 4)
                .mapToLong(index -> (long) (Integer.parseInt(octets[index]) * Math.pow(256, 3 - index)))
                .sum();
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
