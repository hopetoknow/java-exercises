package exercise;

import org.junit.jupiter.api.Test;

import static exercise.App.nrzi;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AppTest {

    @Test
    void testNrziWhenEmptySignal() {
        String actual = nrzi("");
        assertThat(actual).isEqualTo("");
    }

    @Test
    void testNrziWhenInvalidSignal() {
        String actual = nrzi("|");
        assertThat(actual).isEqualTo("");
    }

    @Test
    void testNrzi() {
        String actual1 = nrzi("¯|__|¯|___|¯¯");
        assertThat(actual1).isEqualTo("010110010");

        String actual2 = nrzi("_|¯¯¯|_|¯¯¯¯|_|¯¯");
        assertThat(actual2).isEqualTo("010011000110");

        String actual3 = nrzi("¯|___|¯¯¯¯¯|___|¯|_|¯");
        assertThat(actual3).isEqualTo("010010000100111");

        String actual4 = nrzi("|¯|___|¯¯¯¯¯|___|¯|_|¯");
        assertThat(actual4).isEqualTo("110010000100111");
    }
}
