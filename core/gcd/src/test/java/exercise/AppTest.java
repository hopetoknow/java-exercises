package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testGcd() {
        assertThat(App.gcd(18, 24)).isEqualTo(6);
        assertThat(App.gcd(5, 15)).isEqualTo(5);
        assertThat(App.gcd(0, 10)).isEqualTo(10);
        assertThat(App.gcd(13, 13)).isEqualTo(13);
        assertThat(App.gcd(30, 45)).isEqualTo(15);
        assertThat(App.gcd(0, 0)).isEqualTo(0);
    }

    @Test
    void testGcd2() {
        assertThat(App.gcd2(18, 24)).isEqualTo(6);
        assertThat(App.gcd2(5, 15)).isEqualTo(5);
        assertThat(App.gcd2(0, 10)).isEqualTo(10);
        assertThat(App.gcd2(13, 13)).isEqualTo(13);
        assertThat(App.gcd2(30, 45)).isEqualTo(15);
        assertThat(App.gcd2(0, 0)).isEqualTo(0);
        assertThat(App.gcd2(30, 45)).isEqualTo(15);
        assertThat(App.gcd2(7, 13)).isEqualTo(1);
    }

    @Test
    void testGcd3() {
        assertThat(App.gcd3(18, 24)).isEqualTo(6);
        assertThat(App.gcd3(5, 15)).isEqualTo(5);
        assertThat(App.gcd3(0, 10)).isEqualTo(10);
        assertThat(App.gcd3(13, 13)).isEqualTo(13);
        assertThat(App.gcd3(30, 45)).isEqualTo(15);
        assertThat(App.gcd3(0, 0)).isEqualTo(0);
        assertThat(App.gcd3(30, 45)).isEqualTo(15);
        assertThat(App.gcd3(7, 13)).isEqualTo(1);
    }
}
