/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibiltylive.domain;

/**
 *
 * @author null
 */
public class StandardMessageHandler extends MessageHandler{

    @Override
    public void handle(Message message) {
       if (message.getPriority() < 50){
           System.out.println("Handled standard message : " + message.getContent());
       }
    }
    
}
