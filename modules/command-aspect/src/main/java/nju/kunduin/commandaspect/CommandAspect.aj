package nju.kunduin.commandaspect;

/** @author kunduin */
public aspect CommandAspect {
    declare parents:ConcreteCommandA implements Command;
    declare parents:ConcreteCommandB implements Command;

    public void ConcreteCommandA.execute() {
        executeA();
    }

    public void ConcreteCommandB.execute() {
        executeB();
    }
}
