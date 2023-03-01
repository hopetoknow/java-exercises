package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testGetLastWordLength() {
        assertThat(App.getLastWordLength("")).isEqualTo(0);
        assertThat(App.getLastWordLength("hi")).isEqualTo(2);
        assertThat(App.getLastWordLength("Man in black")).isEqualTo(5);
        assertThat(App.getLastWordLength("hello, world!")).isEqualTo(6);
        assertThat(App.getLastWordLength("Hello, WoRlD!   ")).isEqualTo(6);
    }
}
