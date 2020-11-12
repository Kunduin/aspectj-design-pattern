package nju.kunduin.visitoraspect;

/** @author kunduin */
public class ConcreteCompositeElement {
    private final String a;
    private final String b;
    private final ConcreteElement concreteElementA;
    private final ConcreteElement concreteElementB;

    public ConcreteCompositeElement(
            String a,
            String b,
            ConcreteElement concreteElementA,
            ConcreteElement concreteElementB) {
        this.a = a;
        this.b = b;
        this.concreteElementA = concreteElementA;
        this.concreteElementB = concreteElementB;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public ConcreteElement getConcreteElementA() {
        return concreteElementA;
    }

    public ConcreteElement getConcreteElementB() {
        return concreteElementB;
    }

    @Override
    public String toString() {
        return "ConcreteCompositeElement{"
                + "a='"
                + a
                + '\''
                + ", b='"
                + b
                + '\''
                + ", concreteElementA="
                + concreteElementA
                + ", concreteElementB="
                + concreteElementB
                + '}';
    }
}
