package nju.kunduin.singleton;

/** @author kunduin */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
        System.out.println("Singleton is constructed.");
    }

    public static Singleton getInstance() {
        Singleton singletonRef = singleton;
        if (singletonRef == null) {
            synchronized (Singleton.class) {
                singletonRef = singleton;
                if (singletonRef == null) {
                    singleton = singletonRef = new Singleton();
                }
            }
        }
        return singletonRef;
    }

    public String message = "";

    public void printMessage() {
        System.out.println(this + "\t" + message);
    }
}
