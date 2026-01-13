/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatests;

import java.util.Arrays;
import javax.management.Query;

/**
 *
 * @author null
 */
public class Inner {
    
    public static Boolean isSame(String first, String second){
        class SomeClass implements Comparable<String>{

            private String[] items;
            
            public SomeClass(String s) {
                this.items = s.split("\\s");
            }

            @Override
            public int compareTo(String o) {
               String[] otherItems = o.split("\\s");
                for (int i = 0; i < otherItems.length; i++) {
                    if (!items[i].equals(otherItems[i])){
                        return -1;
                    }
                }
                return 0;
            }
        }
        
        SomeClass c1 = new SomeClass(first);
        
        return c1.compareTo(second) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isSame("a b c d", "a b c d"));
        System.out.println(isSame("a b x d", "a b c d"));
        
    }
}
