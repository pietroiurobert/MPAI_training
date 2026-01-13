package ro.andrei;

import ro.andrei.domain.CustomIterator;
import ro.andrei.domain.Phrase;
import ro.andrei.domain.WordIterator;

public class Main {

    public static void main(String[] args) {
        String s = "this is a cat";
        Phrase p = new Phrase(s);
        CustomIterator wordIterator = p.getIterator();
        while (wordIterator.hasNext()){
            String word = (String)wordIterator.next();
            System.out.println(word);
        }
    }
}
