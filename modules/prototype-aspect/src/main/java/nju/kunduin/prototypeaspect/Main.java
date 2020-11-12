package nju.kunduin.prototypeaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeTypeA realizeTypeA = new RealizeTypeA();
        realizeTypeA.setPhone("123321");
        realizeTypeA.setEmail("kunduin@233.com");
        RealizeTypeA realizeTypeAClone =
                (RealizeTypeA)
                        RealizeTypeClonerAspect.aspectOf()
                                .cloneObject((PrototypeAspect.Prototype) realizeTypeA);

        realizeTypeAClone.setEmail("123@123.com");

        System.out.println(realizeTypeA);
        System.out.println(realizeTypeAClone);
    }
}
