package ro.andrei.domain;

public class Phrase implements CustomIterable{

    private String[] parts;

    public Phrase(String content){
        this.parts = content.split("\\s");
    }

    @Override
    public CustomIterator getIterator() {
        return new WordIterator(parts);
    }
}
