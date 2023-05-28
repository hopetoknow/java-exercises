package exercise;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class App {

    public static void play(int rollsNumber, Supplier<Integer> rollGenerator) {
        List<String> histogramParts = Stream.of("1|", "2|", "3|", "4|", "5|", "6|").collect(Collectors.toList());

        IntStream.rangeClosed(1, rollsNumber)
            .forEach(roll -> {
                int rollResult = rollGenerator.get();
                int index = rollResult - 1;
                String histogramPart = histogramParts.get(index);
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
                histogramParts.set(index, newHistogramPart);
            });

        String histogram = String.join("\n", histogramParts);
        System.out.println(histogram);
    }

    public static void play2(int rollsNumber, Supplier<Integer> rollGenerator) {
        List<Integer> rollsResult = Stream.generate(rollGenerator)
                .limit(rollsNumber)
                .toList();

        String histogram = IntStream.rangeClosed(1, 6)
                .boxed()
                .map(diceSide -> {
                    long sideRollsNumber = rollsResult.stream().filter(number -> number == diceSide).count();
                    String sideRollsNumberAsString = sideRollsNumber != 0 ? " " + sideRollsNumber : "";
                    String hashPart = "#".repeat((int) sideRollsNumber);
                    return String.format("%s|%s%s", diceSide, hashPart, sideRollsNumberAsString);
                })
                .collect(Collectors.joining("\n"));

        System.out.println(histogram);
    }
}
