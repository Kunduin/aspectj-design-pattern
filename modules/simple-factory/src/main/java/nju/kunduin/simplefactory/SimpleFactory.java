package nju.kunduin.simplefactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/** @author kunduin */
public class SimpleFactory {

    public static Product createProduct(ProductType type) {
        switch (type) {
            case PRODUCT_A:
                return new ConcreteProductA();
            case PRODUCT_B:
                return new ConcreteProductB();
            case PRODUCT_C:
                return new ConcreteProductC();
            default:
                throw new NotImplementedException();
        }
    }
}
