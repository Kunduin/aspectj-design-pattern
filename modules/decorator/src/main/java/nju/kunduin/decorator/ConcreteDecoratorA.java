package nju.kunduin.decorator;

/** @author kunduin */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void run() {
        System.out.println("ConcreteDecoratorA Support");
        component.run();
        System.out.println("---------------------------");
    }
}
