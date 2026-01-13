package charactersflyweight;

import charactersflyweight.domain.CharacterDescription;
import charactersflyweight.domain.CharacterFlyweight;
import charactersflyweight.domain.CharacterPosition;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class CharactersFlyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<CharacterPosition> text = new ArrayList<>();
       CharacterFlyweight cache = new CharacterFlyweight();
      
       text.add(new CharacterPosition(0,  cache.getCharacter("a")));
       text.add(new CharacterPosition(0,  cache.getCharacter("n")));
       text.add(new CharacterPosition(0,  cache.getCharacter("d")));
       text.add(new CharacterPosition(0,  cache.getCharacter("r")));
       text.add(new CharacterPosition(0,  cache.getCharacter("e")));
       text.add(new CharacterPosition(0,  cache.getCharacter("i")));
       
        for (CharacterPosition characterPosition : text) {
            System.err.print(characterPosition.description.getDescription());
        }
       
       
    }
    
}
