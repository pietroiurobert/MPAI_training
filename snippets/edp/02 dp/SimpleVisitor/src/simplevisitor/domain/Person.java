package simplevisitor.domain;

public class Person implements Visitor{

    @Override
    public void visitElement(Cab element) {
        System.out.println("going by cab");
    }

    @Override
    public void visitElement(Truck element) {
        System.out.println("this is a little spacious for me");
    }
    
}
