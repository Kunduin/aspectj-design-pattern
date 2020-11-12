package nju.kunduin.decorator;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.run();

        Component decoratorA = new ConcreteDecoratorA(concreteComponent);
        decoratorA.run();

        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.run();
    }
}
