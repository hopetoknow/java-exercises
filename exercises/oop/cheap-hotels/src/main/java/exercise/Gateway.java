package exercise;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.strategy.BookingStrategy;
import exercise.strategy.OstrovokStrategy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Gateway {

    private final List<Map<String, Object>> hotelsByService = getData("data.json");

    private static List<Map<String, Object>> getData(String fileName) {
        Path filePath = Paths.get("exercises","oop", "cheap-hotels", "src", "main", "resources", fileName)
                .toAbsolutePath().normalize();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String content = Files.readString(filePath).trim();
            return mapper.readValue(content, new TypeReference<List<Map<String, Object>>>() { });
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> hotelInfos = new ArrayList<>();

        for (Map<String, Object> serviceHotels : hotelsByService) {
            String service = serviceHotels.get("service").toString();
            List<Map<String, Object>> hotels = (List<Map<String, Object>>) serviceHotels.get("hotels");

            for (Map<String, Object> hotel : hotels) {
                Map<String, Object> hotelAndService = new HashMap<>();
                hotelAndService.put("service", service);

                Map<String, Object> processedHotel = switch (service) {
                    case "booking" -> new BookingStrategy().convert(hotel);
                    case "ostrovok" -> new OstrovokStrategy().convert(hotel);
                    default -> hotel;
                };

                hotelAndService.put("hotel", processedHotel);
                hotelInfos.add(hotelAndService);
            }
        }

        return hotelInfos;
    }
}
