package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testAddDigits() {
        assertThat(App.addDigits(0)).isEqualTo(0);
        assertThat(App.addDigits(1)).isEqualTo(1);
        assertThat(App.addDigits(9)).isEqualTo(9);
        assertThat(App.addDigits(10)).isEqualTo(1);
        assertThat(App.addDigits(19)).isEqualTo(1);
        assertThat(App.addDigits(38)).isEqualTo(2);
        assertThat(App.addDigits(1259)).isEqualTo(8);
    }

    @Test
    public void testAddDigits2() {
        assertThat(App.addDigits2(0)).isEqualTo(0);
        assertThat(App.addDigits2(1)).isEqualTo(1);
        assertThat(App.addDigits2(9)).isEqualTo(9);
        assertThat(App.addDigits2(10)).isEqualTo(1);
        assertThat(App.addDigits2(19)).isEqualTo(1);
        assertThat(App.addDigits2(38)).isEqualTo(2);
        assertThat(App.addDigits2(1259)).isEqualTo(8);
    }
}
