package nju.kunduin.composite;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("leaf 1");
        Component leaf2 = new Leaf("leaf 2");
        Component leaf3 = new Leaf("leaf 3");
        c0.addChild(leaf1);
        c0.addChild(c1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);
        c0.operation();
    }
}
