package nju.kunduin.visitoraspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteElement concreteElementA = new ConcreteElement("1", "2");
        ConcreteElement concreteElementB = new ConcreteElement("3", "4");
        ConcreteCompositeElement concreteCompositeElement =
                new ConcreteCompositeElement("a", "b", concreteElementA, concreteElementB);
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        concreteCompositeElement.accept(concreteVisitor);
    }
}
