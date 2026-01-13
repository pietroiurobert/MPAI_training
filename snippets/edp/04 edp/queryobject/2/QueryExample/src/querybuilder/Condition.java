/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package querybuilder;

/**
 *
 * @author null
 */
public class Condition {
    private String conditionText;
    
    public Condition() {
        conditionText = "";
    }
    
    public Condition greater(String op1, String op2){
        conditionText += op1 + ">" + op2;
        return this;
    }

    public String apply(){
        System.out.println("applying " + conditionText);
        return conditionText;
    }
}
