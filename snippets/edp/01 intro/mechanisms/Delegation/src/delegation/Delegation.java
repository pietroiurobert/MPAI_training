/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package delegation;

import domain.Employee;
import domain.Manager;
import domain.Programmer;

/**
 *
 * @author null
 */
public class Delegation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m = new Manager("Dave");
        Programmer p = new Programmer(Boolean.FALSE, "Jim");
        m.addProgrammer(p);
        Programmer p1 = new Programmer(Boolean.FALSE, "John");
        m.addProgrammer(p1);
        p.doWork();
        m.doWork();
    }
    
}
