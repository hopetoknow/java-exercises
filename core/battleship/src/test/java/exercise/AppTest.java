package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testValidateField() {
        int[][] battleField1 = {};
        assertThat(App.isValidField(battleField1)).isTrue();
    }

    @Test
    public void testValidateField2() {
        int[][] battleField2 = {
                {0, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
        };

        assertThat(App.isValidField(battleField2)).isFalse();
    }

    @Test
    public void testValidateField3() {
        int[][] battleField3 = {
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 1},
        };

        assertThat(App.isValidField(battleField3)).isTrue();
    }

    @Test
    public void testValidateField4() {
        int[][] battleField4 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };

        assertThat(App.isValidField(battleField4)).isTrue();
    }

    @Test
    public void testValidateField5() {
        int[][] battleField5 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1},
                {0, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
        };

        assertThat(App.isValidField(battleField5)).isFalse();
    }
}
