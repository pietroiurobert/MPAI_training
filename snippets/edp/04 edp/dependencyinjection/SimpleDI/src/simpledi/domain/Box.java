/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledi.domain;

import di.annotations.Injectable;

/**
 *
 * @author null
 */
public class Box {

    @Injectable
    private Object content;

    // public Box(T content){}
    public Box() {
    }
    
    
    /**
     * @return the content
     */
    public Object getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(Object content) {
        this.content = content;
    }
    
    public void printContent(){
        System.out.println("Box content: " + content);
    }
    
}
