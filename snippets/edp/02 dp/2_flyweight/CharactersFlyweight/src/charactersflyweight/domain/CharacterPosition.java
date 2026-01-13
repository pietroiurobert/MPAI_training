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
public class CharacterPosition {
    int position;
    public CharacterDescription description;

    public CharacterPosition(int postition, CharacterDescription description) {
        this.position = postition;
        this.description = description;
    }
    
    
}
