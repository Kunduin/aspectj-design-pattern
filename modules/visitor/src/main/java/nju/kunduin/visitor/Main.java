package nju.kunduin.visitor;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();
        DataStruct dataStruct = new DataStruct();
        dataStruct.add(concreteElementA);
        dataStruct.add(concreteElementB);

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        dataStruct.accept(concreteVisitorA);
        dataStruct.accept(concreteVisitorB);
    }
}
