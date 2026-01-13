package simpleproto;

import simpleproto.domain.Command;
import simpleproto.domain.Gadget;
import simpleproto.domain.Prototype;
import simpleproto.domain.PrototypesModule;
import simpleproto.domain.Widget;

public class SimpleProto {

    public static void initializePrototypes() {
        PrototypesModule.addPrototype(new Gadget());
        PrototypesModule.addPrototype(new Widget());
    }

    public static void main(String[] args) {
        initializePrototypes();
        Object[] objects = new Object[3];
        String[] names = {"Widget", "Gadget", "Device"};

        for (int i = 0; i < 3; i++) {
            objects[i] = PrototypesModule.findAndClone(names[i]);
//            if (objects[i] != null) {
//                System.out.println("got : " + ((Prototype) objects[i]).getName());
//            }

        }

        for (int i = 0; i < 3; i++) {
            if (objects[i] != null) {
                ((Command) objects[i]).execute();
            }

        }
    }

}
