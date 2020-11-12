package nju.kunduin.proxy;

/** @author kunduin */
public aspect SubjectAspect {

    pointcut callRequest(): call(void RealSubject.request());

    before(): callRequest() {
        System.out.println("Before request");
    }

    after(): callRequest(){
        System.out.println("After request");
    }
}
