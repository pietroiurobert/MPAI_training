/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flyweightfib;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author null
 */
public class FibFactory {
    private Map<Integer, Integer> values = new HashMap<>();

    public FibFactory() {
        values.put(0, 0);
        values.put(1, 1);
    }
    
    
    
    public Integer getValue(Integer index){
        Integer value = values.get(index);
        if (value == null){
            value = getValue(index - 1) + getValue(index -2 );
            values.put(index, value);
            System.err.println("added " + value + " at index " + index);
        }
        return value;
    }
}
