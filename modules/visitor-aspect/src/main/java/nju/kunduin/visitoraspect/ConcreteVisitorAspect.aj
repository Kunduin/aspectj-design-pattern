package nju.kunduin.visitoraspect;

import java.util.Arrays;
import java.util.List;

/** @author kunduin */
public aspect ConcreteVisitorAspect extends VisitorAspect {
    declare parents:ConcreteCompositeElement implements CompositeElement;
    declare parents:ConcreteElement implements Element;
    declare parents:ConcreteVisitor implements Visitor;

    public List<Element> ConcreteCompositeElement.getElements() {
        return Arrays.asList((Element) this.getConcreteElementA(), (Element) this.getConcreteElementB());
    }

    public void ConcreteVisitor.visitElement(Element element) {
        System.out.println(element);
    }

    public void ConcreteVisitor.visitCompositeElement(CompositeElement element) {
        System.out.println(element);
        element.getElements().forEach(this::visitElement);
    }
}
