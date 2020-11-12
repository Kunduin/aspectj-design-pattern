package nju.kunduin.strategy;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();

        Context context = new Context(concreteStrategyA);
        context.runStrategyMethod();

        context.setStrategy(concreteStrategyB);
        context.runStrategyMethod();
    }
}
