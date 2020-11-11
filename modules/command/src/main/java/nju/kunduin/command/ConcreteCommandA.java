package nju.kunduin.command;

/** @author kunduin */
public class ConcreteCommandA implements Command {

    private final Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.realExecute("by " + this);
    }
}
