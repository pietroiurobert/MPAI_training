/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author null
 */
public class Client extends Colleague {

    public Client(Mediator m) {
        super(m);
    }

    @Override
    public void go(Message message) {
        switch (message.getState()) {
            case "payShop":
                 System.out.println("Trying to buy a product");
                 mediator.handle(message);
                break;
            case "errorProduct":
                System.out.println("Product not in stock");
                break;
            case "error":
                System.out.println("Generic error");
                break;
            case "errorFunds":
                System.out.println("Insufficient funds");
                break;
            case "paymentSuccess":
                System.out.println("Payment successful");
                break;
            default:
                mediator.handle(message);
        }
    }
}
