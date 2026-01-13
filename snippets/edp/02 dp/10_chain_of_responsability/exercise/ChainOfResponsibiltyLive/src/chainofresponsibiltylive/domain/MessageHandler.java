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
public abstract class MessageHandler {
    protected MessageHandler next = null;
    public void setNext(MessageHandler next){
        this.next = next;
    }
    
    public abstract void handle(Message message);
}
