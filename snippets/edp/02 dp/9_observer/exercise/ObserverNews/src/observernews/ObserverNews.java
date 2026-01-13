/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observernews;

import observernews.domain.FickleSubscriber;
import observernews.domain.NewsSubscriber;
import observernews.domain.Newspaper;
import observernews.domain.SpecialNewspaper;

/**
 *
 * @author null
 */
public class ObserverNews {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpecialNewspaper n = new SpecialNewspaper();
        NewsSubscriber s = new FickleSubscriber();
        n.subscribe(s);
        n.generateNews();
    }
    
}
