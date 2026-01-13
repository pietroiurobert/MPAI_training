/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleproto.domain;

/**
 *
 * @author null
 */
public class Widget implements Prototype, Command {

    @Override
    public Object clone() {
        return new Widget();
    }

    @Override
    public String getName() {
        return "Widget";
    }

    @Override
    public void execute() {
        System.out.println("Running widget");
    }

}
