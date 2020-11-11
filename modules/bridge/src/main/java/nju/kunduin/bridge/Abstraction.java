package nju.kunduin.bridge;

/** @author kunduin */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImpl(Implementor implementor) {
        this.implementor = implementor;
    }

    protected abstract void operation();
}
