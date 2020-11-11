package nju.kunduin.commandaspect;

/** @author kunduin */
public class Receiver {

    public void realExecute(String message) {
        System.out.println(this + ": " + message);
    }
}
