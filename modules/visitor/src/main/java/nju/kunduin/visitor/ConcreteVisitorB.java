package nju.kunduin.visitor;

/** @author kunduin */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println(this + ": visitElementA");
        elementA.runA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println(this + ": visitElementB");
        elementB.runB();
    }
}
