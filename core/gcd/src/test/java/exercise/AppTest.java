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
    }

    @Test
    void testGcd2() {
        assertThat(App.gcd2(18, 24)).isEqualTo(6);
        assertThat(App.gcd2(5, 15)).isEqualTo(5);
        assertThat(App.gcd2(0, 10)).isEqualTo(10);
        assertThat(App.gcd2(13, 13)).isEqualTo(13);
        assertThat(App.gcd2(30, 45)).isEqualTo(15);
    }
}
