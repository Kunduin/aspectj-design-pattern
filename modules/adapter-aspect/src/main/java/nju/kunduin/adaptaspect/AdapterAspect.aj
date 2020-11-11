package nju.kunduin.adaptaspect;

/** @author kunduin */
public aspect AdapterAspect {
    declare parents:Adaptee implements Target;

    public void Adaptee.run() {
        specialRun();
    }
}
