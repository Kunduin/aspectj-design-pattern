package nju.kunduin.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author kunduin
 */
public abstract class Subject<A> {

    protected List<Observer<A>> observers = new CopyOnWriteArrayList<>();

    public void subscribe(Observer<A> observer) {
        observers.add(observer);
    }

    protected void onNext(A data) {
        observers.forEach(observer -> observer.update(data));
    }
}
