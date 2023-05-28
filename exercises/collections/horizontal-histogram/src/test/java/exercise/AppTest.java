package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Supplier;
import java.util.Random;

class AppTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private static Supplier<Integer> getRollGenerator(int seed) {
        Random rand = new Random(seed);
        Supplier<Integer> rollGenerator = () -> rand.nextInt(1, 7);
        return rollGenerator;
    }

    @BeforeEach
    void beforeEach() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testPlay1() {
        int rollsNumber = 125;
        final String[] histogramParts = {
                "1|#################### 20",
                "2|################### 19",
                "3|###################### 22",
                "4|######################### 25",
                "5|##################### 21",
                "6|################## 18"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2() {
        int rollsNumber = 100;
        final String[] histogramParts = {
                "1|################ 16",
                "2|################# 17",
                "3|################# 17",
                "4|########## 10",
                "5|###################### 22",
                "6|################## 18"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay3() {
        int rollsNumber = 210;
        final String[] histogramParts = {
                "1|############################################# 45",
                "2|########################### 27",
                "3|###################################### 38",
                "4|######################### 25",
                "5|######################## 24",
                "6|################################################### 51"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlayWithoutValue1() {
        int rollsNumber = 16;
        final String[] histogramParts = {
                "1|",
                "2|# 1",
                "3|### 3",
                "4|## 2",
                "5|##### 5",
                "6|##### 5"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlayWithoutValue2() {
        int rollsNumber = 11;
        final String[] histogramParts = {
                "1|# 1",
                "2|",
                "3|## 2",
                "4|##### 5",
                "5|# 1",
                "6|## 2"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlayWithoutMultipleValues() {
        int rollsNumber = 7;
        final String[] histogramParts = {
                "1|",
                "2|",
                "3|# 1",
                "4|# 1",
                "5|##### 5",
                "6|"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2_1() {
        int rollsNumber = 125;
        final String[] histogramParts = {
                "1|#################### 20",
                "2|################### 19",
                "3|###################### 22",
                "4|######################### 25",
                "5|##################### 21",
                "6|################## 18"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2_2() {
        int rollsNumber = 100;
        final String[] histogramParts = {
                "1|################ 16",
                "2|################# 17",
                "3|################# 17",
                "4|########## 10",
                "5|###################### 22",
                "6|################## 18"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2_3() {
        int rollsNumber = 210;
        final String[] histogramParts = {
                "1|############################################# 45",
                "2|########################### 27",
                "3|###################################### 38",
                "4|######################### 25",
                "5|######################## 24",
                "6|################################################### 51"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2WithoutValue1() {
        int rollsNumber = 16;
        final String[] histogramParts = {
                "1|",
                "2|# 1",
                "3|### 3",
                "4|## 2",
                "5|##### 5",
                "6|##### 5"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2WithoutValue2() {
        int rollsNumber = 11;
        final String[] histogramParts = {
                "1|# 1",
                "2|",
                "3|## 2",
                "4|##### 5",
                "5|# 1",
                "6|## 2"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }

    @Test
    public void testPlay2WithoutMultipleValues() {
        int rollsNumber = 7;
        final String[] histogramParts = {
                "1|",
                "2|",
                "3|# 1",
                "4|# 1",
                "5|##### 5",
                "6|"
        };
        final String expectedHistogram = String.join("\n", histogramParts);

        Supplier<Integer> rollGenerator = getRollGenerator(rollsNumber);
        App.play2(rollsNumber, rollGenerator);
        final String actualHistogram = out.toString().trim();

        assertThat(actualHistogram).isEqualTo(expectedHistogram);
    }
}
