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
public class GenericBox<T>{

    @Injectable(repositoryKey = "tom")
    private T content;

    public GenericBox() {
    }
    
    public void printContent(){
        System.out.println("Box content: " + getContent());
    }

    /**
     * @return the content
     */
    public T getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(T content) {
        this.content = content;
    }
    
}
