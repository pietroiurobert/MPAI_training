package simplevisitor.domain;

public interface Visitor {
    void visitElement(Cab element);
    void visitElement(Truck element);
}
