package nju.kunduin.abstractfactoryaspect;

/** @author kunduin */
public aspect FactoryAspect {
    public Product1 AbstractFactory.createProduct1() {
        return new ConcreteProduct1();
    }

    public Product2 AbstractFactory.createProduct2() {
        return new ConcreteProduct2();
    }
}
