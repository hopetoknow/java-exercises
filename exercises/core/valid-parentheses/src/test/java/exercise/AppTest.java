package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testIsValid() {
        assertThat(App.isValid("()")).isTrue();
        assertThat(App.isValid("(())")).isTrue();
        assertThat(App.isValid("(()((((())))))")).isTrue();
        assertThat(App.isValid(")")).isFalse();
        assertThat(App.isValid("((")).isFalse();
        assertThat(App.isValid("())(")).isFalse();
        assertThat(App.isValid("((())")).isFalse();
        assertThat(App.isValid("(())())")).isFalse();
        assertThat(App.isValid("())(()")).isFalse();
        assertThat(App.isValid("(()(()))))")).isFalse();
    }
}
