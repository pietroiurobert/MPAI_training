/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleadapter;

import java.util.ArrayList;
import java.util.List;
import simpleadapter.domain.adaptors.MessageAdaptor;
import simpleadapter.domain.novel.AdvancedMessage;
import simpleadapter.domain.novel.AdvancedMessageInterface;
import simpleadapter.domain.old.Message;
import simpleadapter.domain.old.MessageInterface;

/**
 *
 * @author null
 */
public class SimpleAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<AdvancedMessageInterface> messages = new ArrayList<>();
        AdvancedMessageInterface novelMessage = new AdvancedMessage();
        
        novelMessage.setText(new String[]{"this", "is", "a", "new", "message"});
        messages.add(novelMessage);
        MessageInterface oldMessage = new Message();
        oldMessage.setText("this is an old message");
        messages.add(new MessageAdaptor(oldMessage));
        for (AdvancedMessageInterface message : messages) {
            message.display();
        }
    }
    
}
