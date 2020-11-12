package nju.kunduin.singletonaspect;

/**
 * @author kunduin
 */
public class Printer {

    public String message = "";

    public Printer() {
        System.out.println("Construct Printer.");
    }

    public void printMessage() {
        System.out.println(this + "\t" + message);
    }
}
