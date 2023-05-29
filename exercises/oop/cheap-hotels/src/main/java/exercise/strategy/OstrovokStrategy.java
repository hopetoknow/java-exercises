package exercise.strategy;

import java.util.Map;

public final class OstrovokStrategy implements Strategy {

    public Map<String, Object> convert(Map<String, Object> hotel) {
        double ostrovokTax = 0.12;

        return Map.of(
                "name", hotel.get("name"),
                "cost", (double) hotel.get("cost") + (double) hotel.get("cost") * ostrovokTax
        );
    }
}
