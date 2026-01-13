/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledi.domain;

import di.annotations.Manageable;



/**
 *
 * @author null
 */
@Manageable(repositoryKey = "tom")
public class Cat {
   
    private String name;

   
    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        
    }

    @Override
    public String toString() {
        return "cat named " + name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
