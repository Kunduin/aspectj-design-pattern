package nju.kunduin.commandaspect;

/** @author kunduin */
public class ConcreteCommandB {

    private final Receiver receiver = new Receiver();

    public void executeB() {
        receiver.realExecute("by " + this);
    }
}
