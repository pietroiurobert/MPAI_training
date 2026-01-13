package di.repositories;

import java.util.HashMap;
import java.util.Map;

public class LocalBeanRepository {

    private static final Map<String, Object> objects = new HashMap<>();

    private LocalBeanRepository() {
    }

    public static Object getObject(String key) {
        return objects.get(key);
    }

    public static void registerObject(String name, Object o) {
        objects.put(name, o);
    }

}