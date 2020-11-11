package nju.kunduin.command;

/** @author kunduin */
public class ConcreteCommandB implements Command {

    private final Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.realExecute("by " + this);
    }
}
