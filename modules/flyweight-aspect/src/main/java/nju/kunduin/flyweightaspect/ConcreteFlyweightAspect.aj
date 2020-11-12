package nju.kunduin.flyweightaspect;

/** @author kunduin */
public aspect ConcreteFlyweightAspect extends FlyweightAspect {

    declare parents:ConcreteFlyweight implements Flyweight;

    pointcut newFlyweight(): call(ConcreteFlyweight.new (..));

    Object around(String key):newFlyweight() && args(key){
        return borrowFlyweight(key, () -> proceed(key));
    }
}
