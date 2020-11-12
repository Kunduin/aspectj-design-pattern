package nju.kunduin.singletonaspect;

/**
 * @author kunduin
 */
public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        printer1.message = "I'm printer1";
        printer1.printMessage();
        printer2.printMessage();

        SpecialPrinter specialPrinter1 = new SpecialPrinter();
        SpecialPrinter specialPrinter2 = new SpecialPrinter();
        specialPrinter1.message = "I'm specialPrinter1";
        specialPrinter1.printMessage();
        specialPrinter2.printMessage();

    }
}
