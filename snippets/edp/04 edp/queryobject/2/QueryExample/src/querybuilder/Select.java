/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package querybuilder;

/**
 *
 * @author null
 */
public class Select{

    private String queryText;
    
    public Select(String source) {
        queryText = "select * from " + source;
    }
    
    public Select where(Condition condition){
        queryText += " where " + condition.apply();
        return this;
    }

    public void execute(){
        System.out.println("executing: " + queryText);
    }
    
}
