package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testCountByYears1() {
        List<Map<String, String>> users = new ArrayList<>();
        Map<Integer, Long> actual = App.getMenCountByYear(users);
        assertThat(actual).isEmpty();
    }

    @Test
    void testCountByYears2() {
        List<Map<String, String>> users = List.of(
                Map.of("name", "Bronn", "gender", "male", "birthday", "1973-03-23"),
                Map.of("name", "Reigar", "gender", "male", "birthday", "1973-11-03"),
                Map.of("name", "Eiegon", "gender", "male", "birthday", "1963-11-03"),
                Map.of("name", "Sansa", "gender", "female", "birthday", "2012-11-03"),
                Map.of("name", "Jon", "gender", "male", "birthday", "1980-11-03"),
                Map.of("name", "Robb", "gender", "male", "birthday", "1980-05-14"),
                Map.of("name", "Tisha", "gender", "female", "birthday", "2012-11-03"),
                Map.of("name", "Rick", "gender", "male", "birthday", "2012-11-03"),
                Map.of("name", "Joffrey", "gender", "male", "birthday", "1999-11-03"),
                Map.of("name", "Edd", "gender", "male", "birthday", "1973-11-03")
        );
        Map<Integer, Long> actual = App.getMenCountByYear(users);

        Map<Integer, Long> expected = Map.of(
                1973, 3L,
                1963, 1L,
                1980, 2L,
                2012, 1L,
                1999, 1L
        );
        System.out.println(expected);
        assertThat(actual).isEqualTo(expected);
    }
}
