package exercise;

class Rational {

    private final int numerator;
    private final int denominator;

    Rational(int numerator, int denominator) {
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational rational) {
        return new Rational(
                numerator * rational.getDenominator() + rational.getNumerator() * denominator,
                denominator * rational.getDenominator());
    }

    public Rational sub(Rational rational) {
        return new Rational(
                numerator * rational.getDenominator() - rational.getNumerator() * denominator,
                denominator * rational.getDenominator());
    }

    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(Math.abs(b), a % b);
    }
}