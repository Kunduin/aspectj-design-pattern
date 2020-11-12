package nju.kunduin.flyweight;

/** @author kunduin */
public class ConcreteFlyweight implements Flyweight {

    private final String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharedFlyweight unsharedFlyweight) {
        System.out.println(this + "[" + key + "]" + ": " + unsharedFlyweight.getMessage());
    }
}
