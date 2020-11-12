package nju.kunduin.adapter;

/** @author kunduin */
public class Adapter extends Adaptee implements Target {
    @Override
    public void run() {
        specialRun();
    }
}
