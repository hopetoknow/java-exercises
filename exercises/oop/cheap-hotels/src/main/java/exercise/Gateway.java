package exercise;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.strategy.BookingStrategy;
import exercise.strategy.OstrovokStrategy;

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
            List<Map<String, Object>> hotels = (List<Map<String, Object>>) serviceHotels.get("hotels");

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
                    double cost = (double) ((Map<String, Object>)hotelInfo.get("hotel")).get("cost");
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

     private Map<String, Object> convertPrice(String service, Map<String, Object> str) {
        if (service.equals("ostrovok")) {
            return new OstrovokStrategy().convert(str);
        } else if (service.equals("booking")) {
            return new BookingStrategy().convert(str);
        }

        return str;
    }
}
