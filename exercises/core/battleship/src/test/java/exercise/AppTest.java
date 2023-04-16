package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testCalcShipsCount() {
        int[][] field1 = {};
        assertThat(App.calculateShipCount(field1)).isEqualTo(0);
    }

    @Test
    public void testCalcShipsCount2() {
        int[][] field2 = {{1}};
        assertThat(App.calculateShipCount(field2)).isEqualTo(1);
    }

    @Test
    public void testCalcShipsCount3() {
        int[][] field3 = {{0}};
        assertThat(App.calculateShipCount(field3)).isEqualTo(0);
    }

    @Test
    public void testCalcShipsCount4() {
        int[][] field4 = {
                {0, 0, 1},
                {0, 0, 0},
                {1, 1, 0},
        };
        assertThat(App.calculateShipCount(field4)).isEqualTo(2);
    }

    @Test
    public void testCalcShipsCount5() {
        int[][] field5 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };
        assertThat(App.calculateShipCount(field5)).isEqualTo(6);
    }

    @Test
    public void testCalcShipsCount6() {
        int[][] field6 = {
                {1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0},
        };
        assertThat(App.calculateShipCount(field6)).isEqualTo(6);
    }

    @Test
    public void testValidateField() {
        int[][] field1 = {};
        assertThat(App.isValidField(field1)).isTrue();
    }

    @Test
    public void testValidateField2() {
        int[][] field2 = {
                {0, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
        };

        assertThat(App.isValidField(field2)).isFalse();
    }

    @Test
    public void testValidateField3() {
        int[][] field3 = {
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 1},
        };

        assertThat(App.isValidField(field3)).isTrue();
    }

    @Test
    public void testValidateField4() {
        int[][] field4 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };

        assertThat(App.isValidField(field4)).isTrue();
    }

    @Test
    public void testValidateField5() {
        int[][] field5 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1},
                {0, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
        };

        assertThat(App.isValidField(field5)).isFalse();
    }

    @Test
    public void testValidateField6() {
        int[][] field6 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        assertThat(App.isValidField(field6)).isFalse();
    }
}
