package exercise;

class App {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd (b, a % b);
    }

    public static int gcd2(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        int result = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
}
