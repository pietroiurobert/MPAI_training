/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiuserserver;

/**
 *
 * @author null
 */
public class MultiUserServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread serverThread = new Thread(new ServerThread());
        serverThread.start();
    }
}
