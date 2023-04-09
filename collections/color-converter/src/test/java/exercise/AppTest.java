package exercise;

import org.junit.jupiter.api.Test;

import static exercise.App.leftPad;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AppTest {

    @Test
    public void testLeftPad() {
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
}
