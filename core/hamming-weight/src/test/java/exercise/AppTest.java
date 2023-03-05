package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testGetHammingWeight() {
        assertThat(App.getHammingWeight(0)).isEqualTo(0);
        assertThat(App.getHammingWeight(1)).isEqualTo(1);
        assertThat(App.getHammingWeight(5)).isEqualTo(2);
        assertThat(App.getHammingWeight(10)).isEqualTo(2);
        assertThat(App.getHammingWeight(101)).isEqualTo(4);
        assertThat(App.getHammingWeight(12345)).isEqualTo(6);
    }
}
