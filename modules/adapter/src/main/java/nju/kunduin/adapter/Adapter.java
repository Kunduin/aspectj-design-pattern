package nju.kunduin.adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void run() {
        specialRun();
    }
}
