package exercise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class App {

    public static long ipToDecimal(String ip) {
        String[] octets = ip.split("\\.");

        return IntStream.range(0, 4)
                .mapToLong(index -> (long) (Integer.parseInt(octets[index]) * Math.pow(256, 3 - index)))
                .sum();
    }

    public static long ipToDecimal2(String ip) {
        String[] octets = ip.split("\\.");
        String binaryIp = Stream.of(octets)
                .map(octet -> {
                    String binaryOctet = Integer.toBinaryString(Integer.parseInt(octet));
                    return leftPad(binaryOctet, 8, "0");
                })
                .collect(Collectors.joining());

        return Long.parseLong(binaryIp, 2);
    }

    public static long ipToDecimal3(String ip) {
        String[] octets = ip.split("\\.");
        String hexIp = Stream.of(octets)
                .map(octet -> {
                    String binaryOctet = Integer.toHexString(Integer.parseInt(octet));
                    return leftPad(binaryOctet, 2, "0");
                })
                .collect(Collectors.joining());

        return Long.parseLong(hexIp, 16);
    }

    public static String decimalToIp(long decimal) {
        String binaryIp = Long.toString(decimal, 2);
        String binaryIpWithLeadingZeros = leftPad(binaryIp, 32, "0");
        String[] binaryOctets = chunk(binaryIpWithLeadingZeros, 8);

        return Stream.of(binaryOctets)
                .map(octet -> {
                    int binaryOctet = Integer.parseInt(octet, 2);
                    return Integer.toString(binaryOctet);
                })
                .collect(Collectors.joining("."));
    }

    public static String decimalToIp2(long decimal) {
        String hexIp = Long.toString(decimal, 16);
        String hexIpWithLeadingZeros = leftPad(hexIp, 8, "0");
        String[] hexOctets = chunk(hexIpWithLeadingZeros, 2);

        return Stream.of(hexOctets)
                .map(octet -> Integer.parseInt(octet, 16))
                .map(Object::toString)
                .collect(Collectors.joining("."));
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
