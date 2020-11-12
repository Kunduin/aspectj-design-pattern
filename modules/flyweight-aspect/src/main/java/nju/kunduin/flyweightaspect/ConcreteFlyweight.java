package nju.kunduin.flyweightaspect;

/** @author kunduin */
public class ConcreteFlyweight {

    private final String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    public void operation(UnsharedFlyweight unsharedFlyweight) {
        System.out.println(this + "[" + key + "]" + ": " + unsharedFlyweight.getMessage());
    }
}
