/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiuserserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author null
 */
public class ServerThread implements Runnable{

    @Override
    public void run() {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(3000);
            while (true) {                
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(new ClientThread(clientSocket));
                clientThread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
