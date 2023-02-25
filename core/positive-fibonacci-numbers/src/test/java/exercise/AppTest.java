package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testGetFibonacciNumber() {
        assertThat(App.getFibonacciNumber(0)).isEqualTo(0);
        assertThat(App.getFibonacciNumber(1)).isEqualTo(1);
        assertThat(App.getFibonacciNumber(2)).isEqualTo(1);
        assertThat(App.getFibonacciNumber(3)).isEqualTo(2);
        assertThat(App.getFibonacciNumber(4)).isEqualTo(3);
        assertThat(App.getFibonacciNumber(5)).isEqualTo(5);
        assertThat(App.getFibonacciNumber(10)).isEqualTo(55);
    }
}
