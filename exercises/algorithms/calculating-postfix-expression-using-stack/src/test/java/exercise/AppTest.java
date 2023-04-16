package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testCalculatePostfix() {
        String expression = "332*+6-";
        int expected = 3;

        int actual = App.calculatePostfix(expression);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testCalculatePostfix2() {
        String expression = "200 300 + 2 / 4 * 12 +";
        int expected = 1012;

        int actual = App.calculatePostfix2(expression);
        assertThat(actual).isEqualTo(expected);
    }
}
