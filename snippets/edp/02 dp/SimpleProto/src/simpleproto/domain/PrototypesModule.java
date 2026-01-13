package simpleproto.domain;

import java.util.ArrayList;
import java.util.List;

public class PrototypesModule {

    private static final List<Prototype> prototypes = new ArrayList<>();

    public static void addPrototype(Prototype obj) {
        prototypes.add(obj);
    }

    public static Object findAndClone(String name) {
        for (Prototype prototype : prototypes) {
            if (prototype.getName().equals(name)) {
                Object o = prototype.clone();
                return o;
            }
        }
        System.out.println(name + " not found");
        return null;
    }
    
}
