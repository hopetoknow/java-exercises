package exercise;

class App {

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
}
