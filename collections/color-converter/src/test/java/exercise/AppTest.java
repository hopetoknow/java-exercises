package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static exercise.App.leftPad;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AppTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void testRgbToHex(String hex, Map<String, Integer> rgb) {
        Integer r = rgb.get("r");
        Integer g = rgb.get("g");
        Integer b = rgb.get("b");
        assertThat(App.rgbToHex(r, g, b)).isEqualTo(hex);
    }

    @Test
    void testLeftPad() {
        assertNull(leftPad(null, 5, "z"));
        assertEquals("zzz", leftPad("", 3, "z"));
        assertEquals("bat", leftPad("bat", 3, "yz"));
        assertEquals("yzbat", leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", leftPad("bat", 8, "yz"));
        assertEquals("bat", leftPad("bat", 1, "yz"));
        assertEquals("bat", leftPad("bat", -1, "yz"));
        assertEquals("  bat", leftPad("bat", 5, null));
        assertEquals("  bat", leftPad("bat", 5, ""));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("#000000", Map.of("r", 0, "g", 0, "b", 0)),
                Arguments.of("#ffffff", Map.of("r", 255, "g", 255, "b", 255)),
                Arguments.of("#00840c", Map.of("r", 0, "g", 132, "b", 12)),
                Arguments.of("#24ab00", Map.of("r", 36, "g", 171, "b", 0)),
                Arguments.of("#543fab", Map.of("r", 84, "g", 63, "b", 171)),
                Arguments.of("#f700de", Map.of("r", 247, "g", 0, "b", 222)),
                Arguments.of("#c60123", Map.of("r", 198, "g", 1, "b", 35))
        );
    }
}
