package specloading;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import specloading.domain.SimpleDisplayableLoader;
import specloading.stub.Displayable;

/**
 *
 * @author null
 */
public class SpecLoading {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Displayable o = (Displayable) SimpleDisplayableLoader.loadDisplayable("src/specloading/testspec");
        o.display();
    }

}
