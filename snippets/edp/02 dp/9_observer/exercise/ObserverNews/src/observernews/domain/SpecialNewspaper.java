/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observernews.domain;

/**
 *
 * @author null
 */
public class SpecialNewspaper extends Newspaper{
    private String content;

    public SpecialNewspaper() {
    }
    
    public void generateNews(){
        this.content = "somenews";
        this.notifySubscribers();
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
