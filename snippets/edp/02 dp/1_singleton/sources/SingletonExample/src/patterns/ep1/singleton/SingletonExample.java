/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.ep1.singleton;

/**
 *
 * @author null
 */
public class SingletonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account firstInstance = Account.getInstance();
        Account secondInstance = Account.getInstance();
        firstInstance.setAmmount(100);
        System.out.println(firstInstance.getAmmount());
        secondInstance.setAmmount(200);
        System.out.println(firstInstance.getAmmount());
    }
}
