/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotproxylive.proxies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author null
 */
public class Robot {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private int x;
    private int y;
    
    public Robot() throws IOException{
        this.socket = new Socket("localhost", 3000);
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    
    private void sendCommand(String command) throws IOException{
        System.out.println("sending command " + command);
        out.println(command);
        String response = in.readLine();
        System.out.println("received " + response);
        String trimmed = response.trim().substring(1, response.length() -1);
        String[] parts = trimmed.split(",");
        this.x = Integer.parseInt(parts[0]);
        this.y = Integer.parseInt(parts[1]);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) throws IOException {
          if (this.x - x >0){
              sendCommand("forward " + (this.x - x));
          }
          else{
              sendCommand("back " + (x - this.x));
          }
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) throws IOException {
         if (this.y - y >0){
              sendCommand("right " + (this.y - y));
          }
          else{
              sendCommand("left " + (y - this.y));
          }
    }
}
