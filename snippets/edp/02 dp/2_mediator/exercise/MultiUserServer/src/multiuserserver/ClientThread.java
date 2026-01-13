/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiuserserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author null
 */
public class ClientThread implements Runnable {

    Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ClientInfo.getInstance().addUser();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine, outputLine;
            out.println("Number of users" + ClientInfo.getInstance().getUserNo());
            while ((inputLine = in.readLine()) != null) {
                outputLine = inputLine.toUpperCase();
                out.println(outputLine);
            }
            
            socket.close();
            ClientInfo.getInstance().removeUser();
        } catch (IOException ex) {
            ClientInfo.getInstance().removeUser();
           ex.printStackTrace();
        }
    }
}
