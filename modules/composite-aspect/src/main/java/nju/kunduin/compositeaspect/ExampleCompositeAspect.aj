package nju.kunduin.compositeaspect;

/** @author kunduin */
public aspect ExampleCompositeAspect extends CompositionProtocol {
    declare parents:ConcreteComposite implements Composite;
    declare parents:ConcreteLeaf implements Leaf;

    public abstract void Component.log();

    public void Composite.log() {
        System.out.println(this + ": Composite.log");
        ExampleCompositeAspect.aspectOf().recurseOperation(this, Component::log);
    }

    public void Leaf.log() {
        System.out.println(this + ": Leaf.log");
    }
}
