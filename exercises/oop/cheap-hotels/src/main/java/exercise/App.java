package exercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<String, Object> findTheCheapestService(Map<String, Integer> priceRangeFilters) {
        Gateway gateway = new Gateway();
        List<Map<String, Object>> hotelInfos = gateway.findAll(priceRangeFilters);

        sort(hotelInfos);

        if (!hotelInfos.isEmpty()) {
            return hotelInfos.get(0);
        }

        return null;
    }

    public static Map<String, Object> findTheCheapestService() {
        return findTheCheapestService(new HashMap<>());
    }

    private static void sort(List<Map<String, Object>> hotelInfos) {
        hotelInfos.sort(Comparator.comparing(hotel -> (double) ((Map<String, Object>)hotel.get("hotel")).get("cost")));
    }
}
