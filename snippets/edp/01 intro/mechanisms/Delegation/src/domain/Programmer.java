/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author null
 */
public class Programmer implements Employee{
    private Boolean status;
    private String name;

    public Programmer(Boolean status, String name) {
        this.status = status;
        this.name = name;
    }

    
    
    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
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

    
    public void doWork() {
        System.out.println(name + " is working");
        setStatus(Boolean.TRUE);
    }
}
