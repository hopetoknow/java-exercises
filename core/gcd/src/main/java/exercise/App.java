package exercise;

class App {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int gcd2(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }

        return 1;
    }

    public static int gcd3(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        int n;
        for (n = 0; ((a | b) & 1) == 0; n++) {
            a >>= 1;
            b >>= 1;
        }

        while ((a & 1) == 0) {
            a >>= 1;
        }

        do {
            while ((b & 1) == 0) {
                b >>= 1;
            }

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            b = (b - a);
        } while (b != 0);

        return a << n;
    }
}
