package nju.kunduin.prototypeaspect;

/** @author kunduin */
public abstract aspect PrototypeAspect {

    interface Prototype {
    }

    @Override public Object Prototype.clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract Object cloneObject(Prototype prototype);
}
