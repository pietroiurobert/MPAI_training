/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package querybuilder;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author null
 */
public class Filter{

    private String filterText;
    private Collection collection;
    
    public Filter(Collection source) {
        this.collection = source;
    }
    
    public Filter where(Predicate predicate){
        for (Iterator<Comparable> it = getCollection().iterator(); it.hasNext();) {
            Comparable object = it.next();
            if (!predicate.apply(object))
                it.remove();
        }
        return this;
    }

    /**
     * @return the collection
     */
    public Collection getCollection() {
        return collection;
    }

    
    
}
