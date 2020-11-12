package nju.kunduin.visitor;

/** @author kunduin */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void runB() {
        System.out.println(this + ": runB");
    }
}
