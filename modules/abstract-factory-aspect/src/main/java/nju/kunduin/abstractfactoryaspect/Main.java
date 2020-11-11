package nju.kunduin.abstractfactoryaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        AbstractFactory defaultAbstractFactory = new DefaultAbstractFactory();
        Product1 product1 = defaultAbstractFactory.createProduct1();
        Product2 product2 = defaultAbstractFactory.createProduct2();

        product1.log();
        product2.log();
    }
}
