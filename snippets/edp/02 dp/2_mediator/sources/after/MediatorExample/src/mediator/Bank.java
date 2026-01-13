/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author null
 */
public class Bank extends Colleague {

    private int accountContent;

    public Bank(Mediator m) {
        super(m);
    }

    @Override
    public void go(Message message) {
        switch (message.getState()) {
            case "debitAccount":
                if (accountContent > message.getAmmount()) {
                    accountContent -= message.getAmmount();
                    mediator.handle(new Message("fundsOK", accountContent));
                } else {
                    mediator.handle(new Message("fundsNOK", accountContent));

                }
                break;
            default:
                mediator.handle(message);
        }

    }

    public void setAmmout(int amount) {
        this.accountContent = amount;
    }
}
