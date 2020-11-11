package nju.kunduin.commandaspect;

/** @author kunduin */
public class ConcreteCommandA {

    private final Receiver receiver = new Receiver();

    public void executeA() {
        receiver.realExecute("by " + this);
    }
}
