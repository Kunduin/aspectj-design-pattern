package nju.kunduin.bridge;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        Abstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImpl(new ConcreteImplementorA());
        refinedAbstraction.operation();

        refinedAbstraction.setImpl(new ConcreteImplementorB());
        refinedAbstraction.operation();
    }
}
