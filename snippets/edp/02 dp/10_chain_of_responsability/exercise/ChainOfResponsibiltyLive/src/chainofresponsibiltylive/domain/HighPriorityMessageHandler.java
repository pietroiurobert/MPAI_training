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
public class HighPriorityMessageHandler extends MessageHandler {

    @Override
    public void handle(Message message) {
        if (message.getPriority() >= 100) {
            System.err.println("handled high priority message : " + message.getContent());
        } else if (this.next != null) {
            this.next.handle(message);
        }
    }

}
