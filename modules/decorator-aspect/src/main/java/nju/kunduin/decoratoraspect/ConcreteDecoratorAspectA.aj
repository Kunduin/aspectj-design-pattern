package nju.kunduin.decoratoraspect;

/** @author kunduin */
public aspect ConcreteDecoratorAspectA extends DecoratorAspect {
    declare parents:ConcreteComponent implements Decorator;

    public pointcut run():call(void ConcreteComponent.run());

    before(Decorator object): run()&&target(object)&&if(object.isUsingDecorator()) {
        System.out.println("\nWith Decorator");
    }
}
