package nju.kunduin.flyweight;

import java.util.HashMap;

/** @author kunduin */
public class FlyweightFactory {
    private final HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    public Flyweight borrowFlyweight(String key) {
        return flyweightHashMap.computeIfAbsent(key, absentKey -> new ConcreteFlyweight(key));
    }
}
