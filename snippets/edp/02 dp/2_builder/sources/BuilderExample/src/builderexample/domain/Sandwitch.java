/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexample.domain;

/**
 *
 * @author null
 */
public class Sandwitch {

    private Bread bread;
    private String meat;
    private String cheese;
    private Onions onions;
   

    private Sandwitch(SandwitchBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.onions = builder.onions;
     
    }

    /**
     * @return the bread
     */
    public Bread getBread() {
        return bread;
    }

    /**
     * @return the meat
     */
    public String getMeat() {
        return meat;
    }

    /**
     * @return the cheese
     */
    public String getCheese() {
        return cheese;
    }

     /**
     * @return the onions
     */
    public Onions getOnions() {
        return onions;
    }

    public static class SandwitchBuilder {
        private Bread bread;
        private String meat;
        private String cheese;
        private Onions onions;
        
        public SandwitchBuilder(Bread bread, String meat) {
           this.bread = bread;
           this.meat = meat;
        }
        
        public SandwitchBuilder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }
        
        public SandwitchBuilder onions(Onions onions){
            this.onions = onions;
            return this;
        }
        
        public Sandwitch build(){
            return new Sandwitch(this);
        }
    }
}
