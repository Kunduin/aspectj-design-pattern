package nju.kunduin.decoratoraspect;

/** @author kunduin */
public abstract aspect DecoratorAspect {
    public interface Decorator {
    }

    private boolean Decorator.enableDecorator = false;

    public void Decorator.useDecorator() {
        enableDecorator = true;
    }

    public boolean Decorator.isUsingDecorator() {
        return enableDecorator;
    }
}
