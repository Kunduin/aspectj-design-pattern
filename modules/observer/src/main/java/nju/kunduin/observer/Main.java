package nju.kunduin.observer;

import java.awt.*;

/**
 * @author kunduin
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Line line = new Line();
        Screen screen1 = new Screen();
        Screen screen2 = new Screen();

        p1.subscribe(screen1);
        p1.subscribe(screen2);
        line.subscribe(screen1);

        p1.setColor(Color.GREEN);
        line.setColor(Color.BLACK);
    }
}
