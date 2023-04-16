package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testIsPowerOfThree() {
        assertThat(App.isPowerOfThree(0)).isFalse();
        assertThat(App.isPowerOfThree(1)).isTrue();
        assertThat(App.isPowerOfThree(3)).isTrue();
        assertThat(App.isPowerOfThree(6)).isFalse();
        assertThat(App.isPowerOfThree(9)).isTrue();
        assertThat(App.isPowerOfThree(27)).isTrue();
        assertThat(App.isPowerOfThree(81)).isTrue();
        assertThat(App.isPowerOfThree(111)).isFalse();
    }
}
