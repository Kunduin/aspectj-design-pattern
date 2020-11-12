package nju.kunduin.simplefactory;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct(ProductType.PRODUCT_A);
        productA.log();
        Product productB = SimpleFactory.createProduct(ProductType.PRODUCT_B);
        productB.log();
        Product productC = SimpleFactory.createProduct(ProductType.PRODUCT_C);
        productC.log();
    }
}
