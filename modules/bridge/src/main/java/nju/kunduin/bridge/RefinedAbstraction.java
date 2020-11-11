package nju.kunduin.bridge;

/** @author kunduin */
public class RefinedAbstraction extends Abstraction {
    @Override
    protected void operation() {
        System.out.println("In Refined Abstraction");
        implementor.operationImpl();
    }
}
