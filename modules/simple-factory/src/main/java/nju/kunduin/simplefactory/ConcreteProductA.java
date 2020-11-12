package nju.kunduin.simplefactory;

/** @author kunduin */
public class ConcreteProductA implements Product {
    @Override
    public void log() {
        System.out.println("I'm ConcreteProductA");
    }
}
