package nju.kunduin.singletonaspect;

public aspect PrinterSingleton extends SingletonPattern {
    declare parents: Printer implements Singleton;
    declare parents: SpecialPrinter implements NonSingleton;
}
