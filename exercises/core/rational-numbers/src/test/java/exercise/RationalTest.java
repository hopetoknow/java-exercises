package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RationalTest {

    @Test
    void testRational() {
        Rational rational1 = new Rational(3, 9);
        assertThat(rational1.getNumerator()).isEqualTo(1);
        assertThat(rational1.getDenominator()).isEqualTo(3);
        assertThat(rational1.toString()).isEqualTo("1/3");

        Rational rational2 = new Rational(-4, 16);
        assertThat(rational2.getNumerator()).isEqualTo(-1);
        assertThat(rational2.getDenominator()).isEqualTo(4);
        assertThat(rational2.toString()).isEqualTo("-1/4");

        Rational rational3 = new Rational(4, -16);
        assertThat(rational3.getNumerator()).isEqualTo(1);
        assertThat(rational3.getDenominator()).isEqualTo(-4);
        assertThat(rational3.toString()).isEqualTo("1/-4");

        Rational rational4 = new Rational(-4, -16);
        assertThat(rational4.getNumerator()).isEqualTo(1);
        assertThat(rational4.getDenominator()).isEqualTo(4);
        assertThat(rational4.toString()).isEqualTo("1/4");
    }

    @Test
    void testAdd() {
        Rational rational1 = new Rational(3, 9);
        Rational rational2 = new Rational(10, 3);
        Rational actual1 = rational1.add(rational2);
        assertThat(actual1.getNumerator()).isEqualTo(11);
        assertThat(actual1.getDenominator()).isEqualTo(3);

        Rational rational3 = new Rational(-4, 16);
        Rational rational4 = new Rational(12, 5);
        Rational actual2 = rational3.add(rational4);
        assertThat(actual2.getNumerator()).isEqualTo(43);
        assertThat(actual2.getDenominator()).isEqualTo(20);
    }

    @Test
    void testSub() {
        var rational1 = new Rational(3, 9);
        var rational2 = new Rational(10, 3);
        var actual1 = rational1.sub(rational2);
        assertThat(actual1.getNumerator()).isEqualTo(-3);
        assertThat(actual1.getDenominator()).isEqualTo(1);

        var rational3 = new Rational(-4, 16);
        var rational4 = new Rational(12, 5);
        var actual2 = rational3.sub(rational4);
        assertThat(actual2.getNumerator()).isEqualTo(-53);
        assertThat(actual2.getDenominator()).isEqualTo(20);
    }
}
