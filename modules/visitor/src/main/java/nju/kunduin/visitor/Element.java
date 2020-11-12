package nju.kunduin.visitor;

/** @author kunduin */
public interface Element {
    void accept(Visitor visitor);
}
