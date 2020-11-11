package nju.kunduin.abstractfactoryaspect;

/** @author kunduin */
public class ConcreteProduct2 implements Product2 {
    @Override
    public void log() {
        System.out.println(this + ": log");
    }
}
