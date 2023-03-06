package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testChunk1() {
        String[] words = {"one", "two", "three", "four", "five", "six"};

        String[][] expected1 = {{"one", "two"}, {"three", "four"}, {"five", "six"}};
        assertThat(App.chunk(words, 2)).isDeepEqualTo(expected1);

        String[][] expected2 = {{"one", "two", "three"}, {"four", "five", "six"}};
        assertThat(App.chunk(words, 3)).isDeepEqualTo(expected2);

        String[][] expected3 = {{"one", "two", "three", "four", "five"}, {"six"}};
        assertThat(App.chunk(words, 5)).isDeepEqualTo(expected3);
    }

    @Test
    public void testChunkWithEmpty() {
        String[] words = {};
        String[][] expected = {};
        assertThat(App.chunk(words, 5)).isDeepEqualTo(expected);
    }

    @Test
    public void testChunkWithOneElement() {
        String[] words = {"one"};
        String[][] expected = {{"one"}};
        assertThat(App.chunk(words, 5)).isDeepEqualTo(expected);
    }
}
