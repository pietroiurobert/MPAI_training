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
public class MediumPriorityMessageHandler extends MessageHandler{

    @Override
    public void handle(Message message) {
        if (message.getPriority() >=50 && message.getPriority() < 100){
            System.out.println("handled medium priority message : " + message.getContent());
        }
        else{
            if (this.next != null){
                this.next.handle(message);
            }
        }
    }
   
    
}
