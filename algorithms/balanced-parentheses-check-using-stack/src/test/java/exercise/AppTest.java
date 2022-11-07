package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testIsBalanced() {
        String str = "([{}])";
        assertThat(App.isBalanced(str)).isTrue();
    }

    @Test
    void testIsBalanced2() {
        String str = "(()((((())))))";
        assertThat(App.isBalanced(str)).isTrue();
    }

    @Test
    void testIsBalanced3() {
        String str = "(()([]))))";
        assertThat(App.isBalanced(str)).isFalse();
    }

    @Test
    void testIsBalanced4() {
        String str = "(){}[]]]]";
        assertThat(App.isBalanced(str)).isFalse();
    }

    @Test
    void testIsBalanced5() {
        String str = "[{{(([]))}}]";
        assertThat(App.isBalanced(str)).isTrue();
    }
}
