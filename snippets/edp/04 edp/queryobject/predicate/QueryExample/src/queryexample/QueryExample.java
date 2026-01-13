/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queryexample;

import domain.Penguin;
import java.util.ArrayList;
import java.util.Collection;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import querybuilder.Predicate;
import querybuilder.Filter;

/**
 *
 * @author null
 */
public class QueryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       Collection c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(new Penguin(i, "penguin mk. " + i));
        }
        final Penguin standardMinPenguin = new Penguin(5, "standard");
        final Penguin standardMaxPenguin = new Penguin(8, "standard");
        Filter f = new Filter(c);
        Predicate<Penguin> greater = new Predicate<Penguin>(standardMinPenguin) {
            @Override
            public boolean apply(Penguin op1) {
                return op1.compareTo(standardMinPenguin)>0?true:false;
            }
        };
        Predicate<Penguin> less = new Predicate<Penguin>(standardMaxPenguin) {
            @Override
            public boolean apply(Penguin op1) {
                return op1.compareTo(standardMaxPenguin)<0?true:false;
            }
        };
        f.where(greater).where(less);
        for (Object p : f.getCollection()) {
            System.out.println(p);
        }
      
    }
}
