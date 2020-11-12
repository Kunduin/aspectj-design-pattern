package nju.kunduin.strategy;

/** @author kunduin */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void runStrategyMethod() {
        System.out.println(this + ": run strategy");
    }
}
