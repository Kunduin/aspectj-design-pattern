package nju.kunduin.observeraspect;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/** @author kunduin */
public abstract aspect ObserverProtocol {

    protected interface Subject {
    }

    protected interface Observer {
    }

    private final WeakHashMap<Object, List<Object>> perSubjectObservers = new WeakHashMap<>();

    protected List<Object> getObserver(Object subject) {
        return perSubjectObservers.computeIfAbsent(subject, k - > new ArrayList<>());
    }

    public void addObserver(Object subject, Object observer) {
        getObserver(subject).add(observer);
    }

    public void removeObserver(Subject subject, Observer observer) {
        getObserver(subject).remove(observer);
    }

    abstract protected pointcut subjectChange(Subject s);

    abstract protected void updateObserver(Object subject, Object observer);

    after(Subject s): subjectChange(s) {
        for (Object o : getObserver(s)) {
            updateObserver(s, o);
        }
    }
}
