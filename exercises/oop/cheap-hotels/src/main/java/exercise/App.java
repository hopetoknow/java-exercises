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

    public static Map<String, Object> findTheCheapestService2(Map<String, Integer> priceRangeFilters) {
        Gateway gateway = new Gateway();

        return gateway.findAll2(priceRangeFilters).stream().min(Comparator.comparing(hotelInfo -> {
                    Map<String, Object> hotel = (Map) hotelInfo.get("hotel");
                    return (double) hotel.get("cost");
                }))
                .orElse(null);
    }

    public static Map<String, Object> findTheCheapestService2() {
        return findTheCheapestService2(new HashMap<>());

    }

    private static void sort(List<Map<String, Object>> hotelInfos) {
        hotelInfos.sort(Comparator.comparing(hotelInfo ->
                (double) ((Map<String, Object>)hotelInfo.get("hotel")).get("cost")));
    }
}
