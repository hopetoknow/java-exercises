package exercise;

public class App {

    public static boolean isValid(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else {
                counter--;
            }

            if (counter < 0) {
                return false;
            }
        }

        return counter == 0;
    }
}