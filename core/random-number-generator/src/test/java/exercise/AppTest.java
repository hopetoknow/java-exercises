package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomTest {

    @Test
    void testGetNext() {
        Random random = new Random(100);
        int result1 = random.getNext();
        int result2 = random.getNext();
        assertThat(result1).isNotEqualTo(result2);

        Random random2 = new Random(100);
        int result21 = random2.getNext();
        int result22 = random2.getNext();
        assertThat(result21).isNotEqualTo(result22);
        assertThat(result1).isEqualTo(result21);
        assertThat(result2).isEqualTo(result22);
    }

    @Test
    void testReset() {
        Random random = new Random(50);
        int result1 = random.getNext();
        int result2 = random.getNext();
        assertThat(result1).isNotEqualTo(result2);

        random.reset();

        int result21 = random.getNext();
        int result22 = random.getNext();
        assertThat(result1).isEqualTo(result21);
        assertThat(result2).isEqualTo(result22);
    }
}
