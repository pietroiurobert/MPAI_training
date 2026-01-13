/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics.domain;

/**
 *
 * @author null
 */
public class Eagle {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    public void soar(){
        System.out.println("soaring");
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
