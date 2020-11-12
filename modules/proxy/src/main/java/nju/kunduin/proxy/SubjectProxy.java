package nju.kunduin.proxy;

/** @author kunduin */
public class SubjectProxy extends RealSubject {

    private void preRequest() {
        System.out.println("Before request");
    }

    private void postRequest() {
        System.out.println("After request");
    }

    @Override
    public void request() {
        preRequest();
        super.request();
        postRequest();
    }
}
