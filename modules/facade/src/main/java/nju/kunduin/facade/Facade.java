package nju.kunduin.facade;

/** @author kunduin */
public class Facade {
    private Subsystem1 subsystem1 = new Subsystem1();
    private Subsystem2 subsystem2 = new Subsystem2();
    private Subsystem3 subsystem3 = new Subsystem3();

    public void run() {
        subsystem1.run1();
        subsystem2.run2();
        subsystem3.run3();
    }
}
