/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleadapter.domain.old;

/**
 *
 * @author null
 */
public class Message implements MessageInterface{
    private String text;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void show() {
        System.out.println("our message was " + this.text);
    }
}
