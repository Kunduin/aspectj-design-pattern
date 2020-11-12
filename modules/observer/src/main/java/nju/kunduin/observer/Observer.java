package nju.kunduin.observer;

/**
 * @author kunduin
 */
public abstract class Observer<A> {

    /**
     * 更新
     *
     * @param data 数据
     */
    public abstract void update(A data);
}
