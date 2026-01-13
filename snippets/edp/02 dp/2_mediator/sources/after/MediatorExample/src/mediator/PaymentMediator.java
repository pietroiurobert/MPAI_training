/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author null
 */
public class PaymentMediator implements Mediator {

    private Bank bank;
    private Shop shop;
    private Client client;

    @Override
    public void handle(Message message) {
        switch (message.getState()) {
            case "payShop":
                shop.go(message);
                break;
            case "contactBank":
                message.setState("debitAccount");
                bank.go(message);
                break;
            case "errorProduct":
                client.go(message);
                break;
            case "fundsOK":
                shop.go(message);
                message.setState("paymentSuccess");
                client.go(message);
                break;
            case "fundsNOK":
                shop.go(message);
                break;
            default:
                message.setState("error");
                client.go(message);
        }
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    /**
     * @param shop the shop to set
     */
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }
}
