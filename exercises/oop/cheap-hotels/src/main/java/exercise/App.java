package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<String, Object> findTheCheapestService(Map<String, Integer> predicates) {
        Gateway gateway = new Gateway();
        List<Map<String, Object>> hotelInfos = gateway.findAll(predicates);

        sort(hotelInfos);
        return hotelInfos.get(0);
    }

    public static Map<String, Object> findTheCheapestService() {
        Gateway gateway = new Gateway();
        List<Map<String, Object>> hotelInfos = gateway.findAll();

        sort(hotelInfos);
        return hotelInfos.get(0);
    }

    private static void sort(List<Map<String, Object>> hotelInfos) {
        hotelInfos.sort(Comparator.comparing(hotel -> (double) ((Map<String, Object>)hotel.get("hotel")).get("cost")));
    }
}
