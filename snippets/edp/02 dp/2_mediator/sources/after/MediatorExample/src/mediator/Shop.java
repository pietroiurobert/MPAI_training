/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.Random;

/**
 *
 * @author null
 */
public class Shop extends Colleague {

    public Shop(Mediator m) {
        super(m);
    }

    @Override
    public void go(Message message) {
        switch (message.getState()) {
            case "payShop":
                Random r = new Random();
                if (r.nextBoolean()) {
                    message.setState("contactBank");
                    mediator.handle(message);
                } else {
                    message.setState("errorProduct");
                    mediator.handle(message);
                }
                break;
            case "fundsNOK":
                System.out.println("Sorry, you can't pay");
                break;
            case "fundsOK":
                System.out.println("Thanks, you have payed");
                break;
            default:
                mediator.handle(message);
        }
    }
}
