package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testGetDifference() {
        assertThat(App.getDifference(0, 0)).isEqualTo(0);
        assertThat(App.getDifference(0, 90)).isEqualTo(90);
        assertThat(App.getDifference(0, 180)).isEqualTo(180);
        assertThat(App.getDifference(0, 190)).isEqualTo(170);
        assertThat(App.getDifference(190, 0)).isEqualTo(170);
        assertThat(App.getDifference(300, 45)).isEqualTo(105);
        assertThat(App.getDifference(240, 300)).isEqualTo(60);
        assertThat(App.getDifference(120, 30)).isEqualTo(90);
    }
}
