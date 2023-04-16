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
        final String expected = String.format("1%n2");


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(1, 2);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz4() {
        final String expected = String.format("Fizz%n4%nBuzz%nFizz%n7%n8%nFizz%nBuzz");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(3, 10);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFizzBuzz5() {
        final String expected = String.format("8%nFizz%nBuzz%n11%nFizz%n13%n14%nFizzBuzz%n16%n17%nFizz%n19%nBuzz");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.fizzBuzz(8, 20);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
}
