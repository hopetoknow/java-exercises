package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AppTest {

    @Test
    void testFindNearest() {
        List<Integer> numbers1 = new ArrayList<>();
        int actual1 = App.findIndexOfClosest(numbers1, 2);
        assertThat(actual1).isEqualTo(-1);

        List<Integer> numbers2 = List.of(10);
        int actual2 = App.findIndexOfClosest(numbers2, 0);
        assertThat(actual2).isEqualTo(0);

        List<Integer> numbers3 = List.of(10, 15);
        int actual3 = App.findIndexOfClosest(numbers3, 0);
        assertThat(actual3).isEqualTo(0);

        List<Integer> numbers4 = List.of(15, 10);
        int actual4 = App.findIndexOfClosest(numbers4, 0);
        assertThat(actual4).isEqualTo(1);

        List<Integer> numbers5 = List.of(15, 10);
        int actual5 = App.findIndexOfClosest(numbers5, 12);
        assertThat(actual5).isEqualTo(1);

        List<Integer> numbers6 = List.of(15, 10, 3, 4);
        int actual6 = App.findIndexOfClosest(numbers6, 0);
        assertThat(actual6).isEqualTo(2);

        List<Integer> numbers7 = List.of(7, 5, 3, 2);
        int actual7 = App.findIndexOfClosest(numbers7, 4);
        assertThat(actual7).isEqualTo(1);

        List<Integer> numbers8 = List.of(7, 5, 4, 4, 3, 6);
        int actual8 = App.findIndexOfClosest(numbers8, 4);
        assertThat(actual8).isEqualTo(2);
    }
}
