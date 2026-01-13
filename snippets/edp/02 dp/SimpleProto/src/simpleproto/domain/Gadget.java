package simpleproto.domain;

public class Gadget implements Prototype, Command {

    @Override
    public Object clone() {
        return new Gadget();
    }

    @Override
    public String getName() {
        return "Gadget";
    }

    @Override
    public void execute() {
        System.out.println("Running gadget");
    }
}
