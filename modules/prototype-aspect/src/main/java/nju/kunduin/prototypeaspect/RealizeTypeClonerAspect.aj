package nju.kunduin.prototypeaspect;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/** @author kunduin */
public aspect RealizeTypeClonerAspect extends PrototypeAspect {

    declare parents:RealizeTypeA implements Prototype;
    declare parents:RealizeTypeB implements Prototype;

    @Override
    public Object cloneObject(Prototype prototype) {
        if (prototype instanceof RealizeTypeA) {
            RealizeTypeA realizeTypeA = new RealizeTypeA();
            realizeTypeA.setEmail(((RealizeTypeA) prototype).getEmail().orElse(null));
            realizeTypeA.setPhone(((RealizeTypeA) prototype).getPhone().orElse(null));
            return realizeTypeA;
        } else if (prototype instanceof RealizeTypeB) {
            RealizeTypeB realizeTypeB = new RealizeTypeB();
            realizeTypeB.setName(((RealizeTypeB) prototype).getName().orElse(null));
            realizeTypeB.setWeight(((RealizeTypeB) prototype).getWeight().orElse(null));
            return realizeTypeB;
        }
        throw new NotImplementedException();
    }
}
