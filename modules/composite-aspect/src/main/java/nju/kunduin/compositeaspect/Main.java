package nju.kunduin.compositeaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteComposite c0 = new ConcreteComposite();
        ConcreteComposite c1 = new ConcreteComposite();
        ConcreteLeaf leaf1 = new ConcreteLeaf();
        ConcreteLeaf leaf2 = new ConcreteLeaf();
        ConcreteLeaf leaf3 = new ConcreteLeaf();
        ExampleCompositeAspect.aspectOf().addChild(c0, leaf1);
        ExampleCompositeAspect.aspectOf().addChild(c0, c1);
        ExampleCompositeAspect.aspectOf().addChild(c1, leaf2);
        ExampleCompositeAspect.aspectOf().addChild(c0, leaf3);

        c0.log();
    }
}
