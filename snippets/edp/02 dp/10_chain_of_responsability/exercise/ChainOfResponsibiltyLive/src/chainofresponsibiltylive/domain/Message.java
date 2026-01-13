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
public class Message {
    private int priority;
    private String content;

    public Message(int priority, String content) {
        this.priority = priority;
        this.content = content;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }
    
    
}
