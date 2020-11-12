package nju.kunduin.visitoraspect;

/** @author kunduin */
public class ConcreteElement {
    private final String c;
    private final String d;

    public ConcreteElement(String c, String d) {
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "ConcreteElement{" + "c='" + c + '\'' + ", d='" + d + '\'' + '}';
    }
}
