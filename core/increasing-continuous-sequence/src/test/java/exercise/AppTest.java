package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testIsContinuousSequence() {
        assertThat(App.isContinuousSequence(new int[] {0, 1, 2, 3})).isTrue();
        assertThat(App.isContinuousSequence(new int[] {-3, -2, -1})).isTrue();
        assertThat(App.isContinuousSequence(new int[] {10, 11, 12, 13})).isTrue();
        assertThat(App.isContinuousSequence(new int[] {})).isFalse();
        assertThat(App.isContinuousSequence(new int[] {7})).isFalse();
        assertThat(App.isContinuousSequence(new int[] {5, 3, 2, 8})).isFalse();
        assertThat(App.isContinuousSequence(new int[] {10, 11, 12, 14, 15})).isFalse();
        assertThat(App.isContinuousSequence(new int[] {10, 11, 11, 12})).isFalse();
    }
}
