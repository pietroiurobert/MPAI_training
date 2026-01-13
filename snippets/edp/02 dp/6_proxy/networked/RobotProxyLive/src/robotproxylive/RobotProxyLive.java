/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotproxylive;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import robotproxylive.proxies.Robot;

/**
 *
 * @author null
 */
public class RobotProxyLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r;
        try {
            r = new Robot();
            r.setX(10);
            System.out.println("robot is now at coordinates " + r.getX() + " and " + r.getY());
            r.setX(5);
            System.out.println("robot is now at coordinates " + r.getX() + " and " + r.getY());
        } catch (IOException ex) {
            Logger.getLogger(RobotProxyLive.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
