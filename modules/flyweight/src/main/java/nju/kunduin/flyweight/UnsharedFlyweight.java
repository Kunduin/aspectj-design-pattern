package nju.kunduin.flyweight;

/** @author kunduin */
public class UnsharedFlyweight {
    private final String message;

    public UnsharedFlyweight(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
