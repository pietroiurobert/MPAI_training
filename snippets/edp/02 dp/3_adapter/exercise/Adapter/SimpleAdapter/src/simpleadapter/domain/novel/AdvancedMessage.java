/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleadapter.domain.novel;

/**
 *
 * @author null
 */
public class AdvancedMessage implements AdvancedMessageInterface{

    private String[] words;
    
    @Override
    public String[] getText() {
        return this.words;
    }

    @Override
    public void setText(String[] words) {
        this.words = words;
    }

    @Override
    public void display() {
        System.out.println("The message was : ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.print(words[i] + "*");
        }
    }
    
}
