/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactersflyweight.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author null
 */
public class CharacterFlyweight {
    private final Map<String,CharacterDescription> characterCache = new HashMap<>();

    public CharacterFlyweight() {
    }
    
    public CharacterDescription getCharacter(String character){
        CharacterDescription result = characterCache.get(character);
        if (result == null){
            result = loadCharacter(character);
            characterCache.put(character, result);
        }
        return result;
    }

    private CharacterDescription loadCharacter(String character) {
        return new CharacterDescription(character.toUpperCase());
    }
}
