package simplevisitor.domain;

public class Elephant implements Visitor{

    @Override
    public void visitElement(Cab element) {
        System.out.println("this is a little craped for me");
    }

    @Override
    public void visitElement(Truck element) {
        System.out.println("that's the one");
    }
    
}
