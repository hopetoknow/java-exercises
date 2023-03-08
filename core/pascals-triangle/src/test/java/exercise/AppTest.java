package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testGenerate1() {
        var actual = App.generate(0);
        int[] expected = {1};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testGenerate2() {
        var actual = App.generate(1);
        int[] expected = {1, 1};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testGenerate3() {
        var actual = App.generate(2);
        int[] expected = {1, 2, 1};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testGenerate4() {
        var actual = App.generate(3);
        int[] expected = {1, 3, 3, 1};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testGenerate5() {
        var actual = App.generate(7);
        int[] expected = {1, 7, 21, 35, 35, 21, 7, 1};
        assertThat(actual).isEqualTo(expected);
    }
}
