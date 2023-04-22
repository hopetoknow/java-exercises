package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static exercise.App.chunk;
import static exercise.App.leftPad;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void testIpToDecimal(String ip, long decimal) {
        assertThat(App.ipToDecimal(ip)).isEqualTo(decimal);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testIpToDecimal2(String ip, long decimal) {
        assertThat(App.ipToDecimal2(ip)).isEqualTo(decimal);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testDecimalToIp(String ip, long decimal) {
        assertThat(App.decimalToIp(decimal)).isEqualTo(ip);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testDecimalToIp2(String ip, long decimal) {
        assertThat(App.decimalToIp2(decimal)).isEqualTo(ip);
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

    @Test
    void testChunk() {
        assertArrayEquals(new String[]{"Hello"}, chunk("Hello", 10));
        assertArrayEquals(new String[]{"Hello"}, chunk("Hello", 5));
        assertArrayEquals(new String[]{"Hello", " Worl", "d"}, chunk("Hello World", 5));
        assertArrayEquals(new String[]{"Hell", "o Wo", "rld"}, chunk("Hello World", 4));
        assertArrayEquals(new String[]{"Hello ", "World"}, chunk("Hello World", 6));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("0.0.0.0", 0L),
                Arguments.of("255.255.255.255", 4294967295L),
                Arguments.of("0.0.0.32", 32L),
                Arguments.of("128.32.10.1", 2149583361L),
                Arguments.of("128.114.17.104", 2154959208L),
                Arguments.of("192.0.0.112", 3221225584L),
                Arguments.of("10.0.115.0", 167801600L)
        );
    }
}
