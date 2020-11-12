package nju.kunduin.visitor;

/** @author kunduin */
public interface Visitor {

    void visit(ConcreteElementA elementA);

    void visit(ConcreteElementB elementB);
}
