package exercise.strategy;

import java.util.HashMap;
import java.util.Map;

public final class KayakStrategy implements Strategy {

    public Map<String, Object> convert(Map<String, Object> hotel) {
        return new HashMap<>(hotel);
    }
}

