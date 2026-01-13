/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queryexample;

import querybuilder.Condition;
import querybuilder.Select;

/**
 *
 * @author null
 */
public class QueryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Select("pets").where(new Condition().greater("weight","5")).execute();
    }
}
