package nju.kunduin.observer;

import java.awt.*;

/**
 * @author kunduin
 */
public class Line extends Subject<String> {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        onNext(this + " color change");
    }
}
