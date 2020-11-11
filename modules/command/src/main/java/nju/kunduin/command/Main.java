package nju.kunduin.command;

public class Main {
    public static void main(String[] args) {
        ConcreteCommandA concreteCommandA = new ConcreteCommandA();
        ConcreteCommandB concreteCommandB = new ConcreteCommandB();

        Invoker invoker = new Invoker(concreteCommandA);
        invoker.execute();

        invoker.setCommand(concreteCommandB);
        invoker.execute();
    }
}
