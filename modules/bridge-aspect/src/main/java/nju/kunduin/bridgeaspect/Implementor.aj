package nju.kunduin.bridgeaspect;

/** @author kunduin */
public aspect Implementor perthis(captureOperation()) {

    public pointcut captureOperation(): execution(void Abstraction.operation());

    void around(): captureOperation() {
        System.out.println("Run Real Impl");
    }
}
