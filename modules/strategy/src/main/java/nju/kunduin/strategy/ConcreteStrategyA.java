package nju.kunduin.strategy;

/** @author kunduin */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void runStrategyMethod() {
        System.out.println(this + ": run strategy");
    }
}
