package nju.kunduin.singletonaspect;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** @author kunduin */
@SuppressWarnings("rawtypes")
public abstract aspect SingletonPattern issingleton() {

    public interface Singleton {
    }

    public interface NonSingleton {
    }

    private final Map<Class, Object> singletons = new ConcurrentHashMap<>();

    pointcut selectSingletons(): call((Singleton +).new (..));

    pointcut excludeNonSingleton(): !call((NonSingleton +).new (..));

    Object around(): selectSingletons() && excludeNonSingleton(){
        Class singletonClass = thisJoinPoint.getSignature().getDeclaringType();
        Object singletonRef = singletons.get(singletonClass);
        if (singletonRef == null) {
            synchronized (singletons) {
                singletonRef = singletons.get(singletonClass);
                if (singletonRef == null) {
                    singletonRef = proceed();
                    singletons.put(singletonClass, singletonRef);
                }
            }
        }
        return singletonRef;
    }
}
