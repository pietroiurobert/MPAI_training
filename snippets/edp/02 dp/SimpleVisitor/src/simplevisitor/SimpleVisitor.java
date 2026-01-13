/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevisitor;

import simplevisitor.domain.Cab;
import simplevisitor.domain.Element;
import simplevisitor.domain.Elephant;
import simplevisitor.domain.Person;
import simplevisitor.domain.Truck;

/**
 *
 * @author null
 */
public class SimpleVisitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Cab cab = new Cab();
        elephant.visitElement(cab);
        Truck truck = new Truck();
        elephant.visitElement(truck);
        Person person = new Person();
        person.visitElement(cab);
        person.visitElement(truck);
    }
    
}
