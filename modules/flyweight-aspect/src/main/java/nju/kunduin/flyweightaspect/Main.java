package nju.kunduin.flyweightaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ConcreteFlyweight flyweight1 = new ConcreteFlyweight("1");
        ConcreteFlyweight flyweight2 = new ConcreteFlyweight("1");
        ConcreteFlyweight flyweight3 = new ConcreteFlyweight("1");
        ConcreteFlyweight flyweight4 = new ConcreteFlyweight("2");
        ConcreteFlyweight flyweight5 = new ConcreteFlyweight("2");
        flyweight1.operation(new UnsharedFlyweight("flyweight1 operation"));
        flyweight2.operation(new UnsharedFlyweight("flyweight2 operation"));
        flyweight3.operation(new UnsharedFlyweight("flyweight3 operation"));
        flyweight4.operation(new UnsharedFlyweight("flyweight4 operation"));
        flyweight5.operation(new UnsharedFlyweight("flyweight5 operation"));
    }
}
