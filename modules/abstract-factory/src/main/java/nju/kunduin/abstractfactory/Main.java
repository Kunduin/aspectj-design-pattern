package nju.kunduin.abstractfactory;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        Product1 product11 = concreteFactory1.createProduct1();
        product11.log();
        Product2 product21 = concreteFactory1.createProduct2();
        product21.log();
        Product1 product12 = concreteFactory2.createProduct1();
        product12.log();
        Product2 product22 = concreteFactory2.createProduct2();
        product22.log();
    }
}
