package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testDnaToRna() {
        assertThat(App.dnaToRna("")).isEqualTo("");
        assertThat(App.dnaToRna("ACGTGGTCTTAA")).isEqualTo("UGCACCAGAAUU");
        assertThat(App.dnaToRna("CCGTA")).isEqualTo("GGCAU");
        assertThat(App.dnaToRna("ACNTG")).isNull();
    }
}
