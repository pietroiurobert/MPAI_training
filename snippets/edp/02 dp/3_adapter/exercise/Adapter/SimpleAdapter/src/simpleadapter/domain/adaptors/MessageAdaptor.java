/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleadapter.domain.adaptors;

import java.util.Arrays;
import simpleadapter.domain.novel.AdvancedMessageInterface;
import simpleadapter.domain.old.MessageInterface;

/**
 *
 * @author null
 */
public class MessageAdaptor implements AdvancedMessageInterface{

    MessageInterface oldMessage;

    public MessageAdaptor(MessageInterface oldMessage) {
        this.oldMessage = oldMessage;
    }
    
    
    
    @Override
    public String[] getText() {
        return oldMessage.getText().split("\\s");
    }

    @Override
    public void setText(String[] words) {
        oldMessage.setText(String.join(" ", Arrays.asList(words)));
    }

    @Override
    public void display() {
        oldMessage.show();
    }
    
}
