package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testSameParity() {
        List<Integer> list1 = List.of(5, 0, 1, -3, 10);
        List<Integer> actual1 = App.sameParityFilter(list1);
        assertThat(actual1).containsExactly(5, 1, -3);

        List<Integer> list2 = List.of(2, 0, 1, -3, 10, -2);
        List<Integer> actual2 = App.sameParityFilter(list2);
        assertThat(actual2).containsExactly(2, 0, 10, -2);

        List<Integer> list3 = List.of(-1, 0, 1, -3, 10, -2);
        List<Integer> actual3 = App.sameParityFilter(list3);
        assertThat(actual3).containsExactly(-1, 1, -3);

        List<Integer> list4 = new ArrayList<>();
        List<Integer> actual4 = App.sameParityFilter(list4);
        assertThat(actual4).isEmpty();
    }
}
