/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observernews.domain;

import java.util.Random;

/**
 *
 * @author null
 */
public class FickleSubscriber implements NewsSubscriber {

    private Random r = new Random();

    @Override
    public void notifyNewsSubscriber(ContentProvider n) {
        if (r.nextBoolean()) {
            System.out.println("got content " + n.getContent());
        } else {
            System.out.println("not today");
        }

    }

}
