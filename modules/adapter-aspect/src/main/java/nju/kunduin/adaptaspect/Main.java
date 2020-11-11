package nju.kunduin.adaptaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        Target adapter = (Target) new Adaptee();
        adapter.run();
    }
}
