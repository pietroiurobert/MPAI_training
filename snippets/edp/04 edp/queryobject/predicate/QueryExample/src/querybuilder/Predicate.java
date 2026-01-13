/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package querybuilder;


/**
 *
 * @author null
 */
public abstract class Predicate<T extends Comparable<T>> {
    T op2;
    
    public Predicate(T op2) {
        this.op2 = op2;
    }
    
    public abstract boolean apply(T op1);

}
