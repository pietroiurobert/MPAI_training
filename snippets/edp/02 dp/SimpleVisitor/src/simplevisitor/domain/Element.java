package simplevisitor.domain;

public interface Element {
    void accept(Visitor visitor);
}
