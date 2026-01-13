/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactersflyweight.domain;

/**
 *
 * @author null
 */
public class CharacterDescription {
    private String description;

    public CharacterDescription(String description) {
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    
}
