/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generics.domain;

/**
 *
 * @author Andrei Toma
 */
public class Nest<T> {
    public T content;
    public void addContent(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }
}
