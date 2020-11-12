package nju.kunduin.flyweightaspect;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/** @author kunduin */
public abstract aspect FlyweightAspect {
    protected interface Flyweight {
    }


    private final Map<String, Object> flyweightHashMap = new ConcurrentHashMap<>();


    public Object borrowFlyweight(String key, Supplier<Object> runnable) {
        return flyweightHashMap.computeIfAbsent(key, absentKey -> runnable.get());
    }
}
