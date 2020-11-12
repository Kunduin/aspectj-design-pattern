package nju.kunduin.observeraspect;

/** @author kunduin */
public aspect CoordinateObserver extends ObserverProtocol {

    declare parents:Point implements Subject;
    declare parents:Line implements Subject;
    declare parents:Screen implements Observer;

    protected pointcut subjectChange(Subject s):
            (call(void Point.setX(int))
                    || call(void Point.setY(int))
                    || call(void Line.setP1(Point))
                    || call(void Line.setP2(Point))) && target(s);

    @Override
    protected void updateObserver(Object subject, Object observer) {
        ((Screen) observer).display("Coordinate change.");
    }

}
