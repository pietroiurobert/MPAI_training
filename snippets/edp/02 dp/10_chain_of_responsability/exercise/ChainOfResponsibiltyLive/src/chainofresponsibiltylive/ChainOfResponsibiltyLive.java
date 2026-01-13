/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibiltylive;

import chainofresponsibiltylive.domain.HighPriorityMessageHandler;
import chainofresponsibiltylive.domain.MediumPriorityMessageHandler;
import chainofresponsibiltylive.domain.Message;
import chainofresponsibiltylive.domain.MessageHandler;
import chainofresponsibiltylive.domain.StandardMessageHandler;

/**
 *
 * @author null
 */
public class ChainOfResponsibiltyLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageHandler standard  = new StandardMessageHandler();
        MessageHandler medium = new MediumPriorityMessageHandler();
        MessageHandler high = new HighPriorityMessageHandler();
        high.setNext(medium);
        medium.setNext(standard);
        Message m1 = new Message(10, "Lost keys");
        high.handle(m1);
        Message m2 = new Message(70, "Door forced");
        high.handle(m2);
        Message m3 = new Message(200, "Robot uprising");
        high.handle(m3);
    }
    
}
