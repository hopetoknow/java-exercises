package exercise;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void testFindTheCheapestServiceWithMinMax() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 616.0, "name", "marriott"),
                "service", "ostrovok"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 600,
                "max", 800
        );

        Map<String, Object> actual = App.findTheCheapestService(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void testFindTheCheapestServiceWithMinMax2() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 672.0, "name", "bestHotel"),
                "service", "ostrovok"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 650,
                "max", 700
        );

        Map<String, Object> actual = App.findTheCheapestService(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestServiceWithMinOnly() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 802.5, "name", "hilton"),
                "service", "booking"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 800
        );

        Map<String, Object> actual = App.findTheCheapestService(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestServiceWithMaxOnly() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 500.0, "name", "marriott"),
                "service", "kayak"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "max", 570
        );

        Map<String, Object> actual = App.findTheCheapestService(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestServiceWithoutLimits() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 500.0, "name", "marriott"),
                "service", "kayak"
        );

        Map<String, Object> actual = App.findTheCheapestService();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestServiceWithNoMatch() {
        Map<String, Object> expected = null;

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 4200,
                "max", 42000
        );

        Map<String, Object> actual = App.findTheCheapestService(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestService2WithMinMax() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 616.0, "name", "marriott"),
                "service", "ostrovok"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 600,
                "max", 800
        );

        Map<String, Object> actual = App.findTheCheapestService2(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void testFindTheCheapestService2WithMinMax2() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 672.0, "name", "bestHotel"),
                "service", "ostrovok"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 650,
                "max", 700
        );

        Map<String, Object> actual = App.findTheCheapestService2(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestService2WithMinOnly() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 802.5, "name", "hilton"),
                "service", "booking"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 800
        );

        Map<String, Object> actual = App.findTheCheapestService2(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestService2WithMaxOnly() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 500.0, "name", "marriott"),
                "service", "kayak"
        );

        Map<String, Integer> priceRangeFilters = Map.of(
                "max", 570
        );

        Map<String, Object> actual = App.findTheCheapestService2(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestService2WithoutLimits() {
        Map<String, Object> expected = Map.of(
                "hotel", Map.of("cost", 500.0, "name", "marriott"),
                "service", "kayak"
        );

        Map<String, Object> actual = App.findTheCheapestService2();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testFindTheCheapestService2WithNoMatch() {
        Map<String, Object> expected = null;

        Map<String, Integer> priceRangeFilters = Map.of(
                "min", 4200,
                "max", 42000
        );

        Map<String, Object> actual = App.findTheCheapestService2(priceRangeFilters);
        assertThat(actual).isEqualTo(expected);
    }
}
