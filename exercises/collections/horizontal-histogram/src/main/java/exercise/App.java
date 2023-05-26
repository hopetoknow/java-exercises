package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Supplier;

class App {

    public static void play(int rollsNumber, Supplier<Integer> rollTheDice) {
        List<String> histogram = Stream.of("1|", "2|", "3|", "4|", "5|", "6|").collect(Collectors.toList());

        IntStream.range(0, rollsNumber)
            .forEach(roll -> {
                int rollResult = rollTheDice.get();
                int index = rollResult - 1;
                String histogramPart = histogram.get(index);
                String newHistogramPart;

                if (histogramPart.endsWith("|")) {
                    newHistogramPart = histogramPart + "# 1";
                } else {
                    newHistogramPart = Stream.of(histogramPart.split(" "))
                            .map(item -> {
                                if (item.endsWith("#")) {
                                    return item + "#";
                                } else {
                                    return String.valueOf(Integer.parseInt(item) + 1);
                                }
                            }).collect(Collectors.joining(" "));
                }
                histogram.set(index, newHistogramPart);
            });

        String histogramAsString = String.join("\n", histogram);
        System.out.println(histogramAsString);
    }
}
