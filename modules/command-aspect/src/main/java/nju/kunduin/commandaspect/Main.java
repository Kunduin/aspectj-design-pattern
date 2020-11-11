package nju.kunduin.commandaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteCommandA concreteCommandA = new ConcreteCommandA();
        ConcreteCommandB concreteCommandB = new ConcreteCommandB();

        Invoker invoker = new Invoker((Command) concreteCommandA);
        invoker.execute();

        invoker.setCommand((Command) concreteCommandB);
        invoker.execute();
    }
}
