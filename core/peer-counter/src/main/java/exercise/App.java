package exercise;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class App {

    public static Map<Integer, Long> getMenCountByYear(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .map(user -> LocalDate.parse(user.get("birthday")).getYear())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}