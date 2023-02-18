package exercise;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testFizzBuzz1() {
        final String expected = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(1, 0);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz2() {
        final String expected = "Buzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(10, 10);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz3() {
        final String expected = "1\r\n2";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(1, 2);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz4() {
        final String expected = "Fizz\r\n4\r\nBuzz\r\nFizz\r\n7\r\n8\r\nFizz\r\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(3, 10);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz5() {
        final String expected = "8\r\nFizz\r\nBuzz\r\n11\r\nFizz\r\n13\r\n14\r\nFizzBuzz\r\n16\r\n17\r\nFizz\r\n19\r\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(8, 20);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
}
