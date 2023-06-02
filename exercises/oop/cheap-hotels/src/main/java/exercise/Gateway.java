package exercise;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.strategy.BookingStrategy;
import exercise.strategy.KayakStrategy;
import exercise.strategy.OstrovokStrategy;
import exercise.strategy.Strategy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Gateway {

    private static final String FILE_NAME = "data.json";

    private final List<Map<String, Object>> hotelsByService = getData(FILE_NAME);

    public List<Map<String, Object>> findAll(Map<String, Integer> priceRangeFilters) {
        List<Map<String, Object>> hotelInfos = new ArrayList<>();

        for (Map<String, Object> serviceHotels : hotelsByService) {
            String service = serviceHotels.get("service").toString();
            List<Map<String, Object>> hotels = (List) serviceHotels.get("hotels");

            for (Map<String, Object> hotel : hotels) {
                Map<String, Object> hotelAndService = new HashMap<>();
                Map<String, Object> processedHotel = convertPrice(service, hotel);
                hotelAndService.put("service", service);
                hotelAndService.put("hotel", processedHotel);
                hotelInfos.add(hotelAndService);
            }
        }

        return hotelInfos.stream()
                .filter(hotelInfo -> {
                    double cost = (double) ((Map) hotelInfo.get("hotel")).get("cost");
                    Integer min = priceRangeFilters.get("min");
                    Integer max = priceRangeFilters.get("max");

                    if (min != null && max != null) {
                        return cost >= min && cost <= max;
                    } else if (min != null) {
                        return cost >= min;
                    } else if (max != null) {
                        return cost <= max;
                    }

                    return true;
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> findAll2(Map<String, Integer> priceRangeFilters) {
        Map<String, Strategy> strategies = Map.of(
                "ostrovok", new OstrovokStrategy(),
                "booking", new BookingStrategy(),
                "kayak", new KayakStrategy()
        );

        Map<String, Integer> defaultPriceRangeFilters = Map.of(
                "min", 0,
                "max", Integer.MAX_VALUE
        );

        Map<String, Integer> mergedPriceRangeFilters = new HashMap<>(defaultPriceRangeFilters);
        mergedPriceRangeFilters.putAll(priceRangeFilters);
        int min = mergedPriceRangeFilters.get("min");
        int max = mergedPriceRangeFilters.get("max");

        return hotelsByService.stream().flatMap(serviceHotels -> {
            String service = serviceHotels.get("service").toString();
            List<Map<String, Object>> hotels = (List) serviceHotels.get("hotels");
            Strategy strategy = strategies.get(service);

            return hotels.stream()
                    .map(hotel -> Map.of(
                            "hotel", strategy.convert(hotel),
                            "service", service
                    ))
                    .filter(hotelInfo -> {
                       Map<String, Object> hotel = (Map) hotelInfo.get("hotel");
                       double price = (double) hotel.get("cost");
                       return price >= min && price <= max;
                    });
        }).toList();
    }

    public List<Map<String, Object>> findAll2() {
        return findAll(new HashMap<String, Integer>());
    }

    private static List<Map<String, Object>> getData(String fileName) {
        Path filePath = Paths.get("src", "main", "resources", fileName).toAbsolutePath().normalize();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String content = Files.readString(filePath).trim();
            return mapper.readValue(content, new TypeReference<List<Map<String, Object>>>() { });
        } catch (IOException e) {
            throw new RuntimeException("Error reading JSON file: " + fileName, e);
        }
    }

     private Map<String, Object> convertPrice(String service, Map<String, Object> hotel) {
        if (service.equals("ostrovok")) {
            return new OstrovokStrategy().convert(hotel);
        } else if (service.equals("booking")) {
            return new BookingStrategy().convert(hotel);
        }

        return hotel;
    }
}