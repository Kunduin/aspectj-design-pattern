package nju.kunduin.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        System.out.println("Factory1 -> Product1");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 createProduct2() {
        System.out.println("Factory1 -> Product2");
        return new ConcreteProduct21();
    }
}
