package nju.kunduin.observer;

/**
 * @author kunduin
 */
public class Screen extends Observer<String> {

    @Override
    public void update(String data) {
        System.out.println(this + ": " + data);
    }
}
