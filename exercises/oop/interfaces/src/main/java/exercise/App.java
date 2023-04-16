package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, int elementNumber)  {
        return apartments.stream()
                .sorted(Home::compareTo)
                .limit(elementNumber)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
// END
