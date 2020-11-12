package nju.kunduin.visitor;

/** @author kunduin */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void runA() {
        System.out.println(this + ": runA");
    }
}
