/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author null
 */
public class ConsoleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factory ready. Insert product:");
        try{
	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = bufferRead.readLine())!=null) {                
                System.out.println(CarFactory.buildCar(s.trim()).test());
            }
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
    }
}
