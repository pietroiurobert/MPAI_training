/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorexample;

import mediator.Bank;
import mediator.Client;
import mediator.Mediator;
import mediator.Message;
import mediator.PaymentMediator;
import mediator.Shop;

/**
 *
 * @author null
 */
public class MediatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaymentMediator m = new PaymentMediator();
        Bank bank = new Bank(m);
        Shop shop = new Shop(m);
        bank.setAmmout(1000);
        Client client = new Client(m);
        m.setBank(bank);
        m.setClient(client);
        m.setShop(shop);
        //for (int i = 0; i < 10; i++) {
            client.go(new Message("payShop", 100));
        //}

    }
}
