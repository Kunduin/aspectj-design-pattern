package nju.kunduin.proxy;

/** @author kunduin */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real Subject Request");
    }
}
