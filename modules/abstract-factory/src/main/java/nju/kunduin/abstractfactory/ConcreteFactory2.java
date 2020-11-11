package nju.kunduin.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        System.out.println("Factory2 -> Product1");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 createProduct2() {
        System.out.println("Factory2 -> Product2");
        return new ConcreteProduct22();
    }
}
