package simplevisitor.domain;

public class Truck implements Element{

    @Override
    public void accept(Visitor visitor) {
       visitor.visitElement(this);
    }
}
