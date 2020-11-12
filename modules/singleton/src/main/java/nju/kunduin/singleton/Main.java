package nju.kunduin.singleton;

/**
 * @author kunduin
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.message = "I'm printer1";
        singleton1.printMessage();
        singleton2.printMessage();
    }
}
