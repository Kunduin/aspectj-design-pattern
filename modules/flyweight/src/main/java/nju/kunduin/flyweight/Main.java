package nju.kunduin.flyweight;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.borrowFlyweight("1");
        Flyweight flyweight2 = flyweightFactory.borrowFlyweight("1");
        Flyweight flyweight3 = flyweightFactory.borrowFlyweight("1");
        Flyweight flyweight4 = flyweightFactory.borrowFlyweight("2");
        Flyweight flyweight5 = flyweightFactory.borrowFlyweight("2");
        flyweight1.operation(new UnsharedFlyweight("flyweight1 operation"));
        flyweight2.operation(new UnsharedFlyweight("flyweight2 operation"));
        flyweight3.operation(new UnsharedFlyweight("flyweight3 operation"));
        flyweight4.operation(new UnsharedFlyweight("flyweight4 operation"));
        flyweight5.operation(new UnsharedFlyweight("flyweight5 operation"));
    }
}
