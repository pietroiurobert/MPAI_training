/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author null
 */
public class Penguin implements Comparable<Penguin> {

    private int size;
    private String name;

    public Penguin(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int compareTo(Penguin o) {
        return this.size - o.size;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
