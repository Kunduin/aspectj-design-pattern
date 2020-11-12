package nju.kunduin.decorator;

/** @author kunduin */
public class ConcreteComponent implements Component {
    @Override
    public void run() {
        System.out.println("ConcreteComponent is running");
    }
}
