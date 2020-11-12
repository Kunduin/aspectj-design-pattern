package nju.kunduin.decoratoraspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.run();

        concreteComponent.useDecorator();
        concreteComponent.run();
    }
}
