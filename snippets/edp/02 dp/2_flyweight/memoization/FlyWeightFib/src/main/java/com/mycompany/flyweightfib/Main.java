/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flyweightfib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author null
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FibFactory fib = new FibFactory();
        while (true) {            
            String line = reader.readLine();
            Integer index = Integer.parseInt(line);
            Integer value = fib.getValue(index);
            System.out.println("value for index " + index + " is " + value);
        }
        
    }
}
