package nju.kunduin.observeraspect;

/** @author kunduin */
public aspect ColorObserver extends ObserverProtocol {


    protected pointcut subjectChange(Subject s):
            (call(void Point.setColor(Color)) ||
                    call(void Line.setColor(Color))) && target(s);

    @Override
    protected void updateObserver(Object subject, Object observer) {
        ((Screen) observer).display("Color change.");
    }
}
