package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testSameParity() {
        List<String> list1 = List.of("lazing", "lazy", "lacer");
        List<String> actual1 = App.filterAnagram("laser", list1);
        assertThat(actual1).isEmpty();

        List<String> list2 = List.of("aabb", "abcd", "bbaa", "dada");
        List<String> actual2 = App.filterAnagram("abba", list2);
        assertThat(actual2).containsExactly("aabb", "bbaa");

        List<String> list3 = List.of("crazer", "carer", "racar", "caers", "racer");
        List<String> actual3 = App.filterAnagram("racer", list3);
        assertThat(actual3).containsExactly("carer", "racer");
    }
}
