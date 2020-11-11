package nju.kunduin.abstractfactoryaspect;

/** @author kunduin */
public class ConcreteProduct1 implements Product1 {
    @Override
    public void log() {
        System.out.println(this + ": log");
    }
}
