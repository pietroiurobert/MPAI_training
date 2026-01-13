/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatests;

import java.util.function.Consumer;

/**
 *
 * @author null
 */
public class LambdaTests {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t1 = 10;
        int t2 = 20;
        
        Consumer<Integer> c = (x) -> {
            x = x + 5;
            System.out.println("x " + x);
            System.out.println("t1 " + t1);
            System.out.println("t2 " + t2);
        };
        c.accept(t1);
        c.accept(t2);
        
    }
    
}
