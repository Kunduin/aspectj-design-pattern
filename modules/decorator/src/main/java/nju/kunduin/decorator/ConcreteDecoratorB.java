package nju.kunduin.decorator;

/** @author kunduin */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void run() {
        System.out.println("ConcreteDecoratorB Support");
        component.run();
        System.out.println("---------------------------");
    }
}
