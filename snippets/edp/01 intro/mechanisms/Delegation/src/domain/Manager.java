/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class Manager implements Employee {

    private List<Programmer> team;

    private String name;

    public Manager(String name) {
        this.name = name;
        team = new ArrayList<>();
    }

    public void addProgrammer(Programmer p) {
        team.add(p);
    }

    public void doWork() {
        for (Programmer programmer : team) {
            if (programmer.getStatus() == Boolean.FALSE) {
                programmer.doWork();
                return;
            }
        }
        System.out.println("No programmer available");
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
