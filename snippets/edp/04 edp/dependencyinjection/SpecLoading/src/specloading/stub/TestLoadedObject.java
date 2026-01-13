/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specloading.stub;

/**
 *
 * @author null
 */
public class TestLoadedObject implements Displayable{
    private String somestring;
    private Integer someint;

    public TestLoadedObject(String somestring, Integer someint) {
        this.somestring = somestring;
        this.someint = someint;
    }
    
    public void display(){
        System.out.println(somestring + " | " + someint);
    }

    /**
     * @return the somestring
     */
    public String getSomestring() {
        return somestring;
    }

    /**
     * @param somestring the somestring to set
     */
    public void setSomestring(String somestring) {
        this.somestring = somestring;
    }

    /**
     * @return the someint
     */
    public Integer getSomeint() {
        return someint;
    }

    /**
     * @param someint the someint to set
     */
    public void setSomeint(Integer someint) {
        this.someint = someint;
    }
    
}
