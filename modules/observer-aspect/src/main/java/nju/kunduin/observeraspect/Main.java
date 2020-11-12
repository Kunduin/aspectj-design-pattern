package nju.kunduin.observeraspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        Line l = new Line();
        Screen screen = new Screen();
        ColorObserver colorAspect = ColorObserver.aspectOf();
        colorAspect.addObserver(l, screen);
        colorAspect.addObserver(p1, screen);
        colorAspect.addObserver(p2, screen);
        CoordinateObserver coordinateAspect = CoordinateObserver.aspectOf();
        coordinateAspect.addObserver(l, screen);
        coordinateAspect.addObserver(p1, screen);
        coordinateAspect.addObserver(p2, screen);

        l.setColor(Color.BLACK);
        l.setP1(p1);
        p1.setColor(Color.BLACK);
        p2.setColor(Color.GREEN);
        p1.setX(2);
        p2.setX(2);
        p2.setY(1);
    }
}
