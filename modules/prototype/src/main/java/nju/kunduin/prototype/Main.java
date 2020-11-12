package nju.kunduin.prototype;

/** @author kunduin */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        realizeType.setPhone("123321");
        realizeType.setEmail("kunduin@233.com");

        RealizeType realizeTypeClone = (RealizeType) realizeType.clone();
        realizeTypeClone.setEmail("233@233.com");
        System.out.println(
                "realizeTypeClone.getEmail: " + realizeTypeClone.getEmail().orElse("no value"));
        System.out.println(
                "realizeType.getEmail:      " + realizeType.getEmail().orElse("no value"));
    }
}
