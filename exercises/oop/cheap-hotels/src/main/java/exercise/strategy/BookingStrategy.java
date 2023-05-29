package exercise.strategy;

import java.util.Map;

public final class BookingStrategy implements Strategy {

    public Map<String, Object> convert(Map<String, Object> hotel) {
        double exchangeRate = 75;

        return Map.of(
                "name", hotel.get("name"),
                "cost", (double) hotel.get("cost") * exchangeRate
        );
    }
}
