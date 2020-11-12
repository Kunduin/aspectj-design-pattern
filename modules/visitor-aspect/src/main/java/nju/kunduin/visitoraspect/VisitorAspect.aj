package nju.kunduin.visitoraspect;

import java.util.List;

/** @author kunduin */
public abstract aspect VisitorAspect {
    protected interface Element {
        default void accept(Visitor visitor) {
            visitor.visitElement(this);
        }
    }

    protected interface CompositeElement extends Element {
        List<Element> getElements();

        @Override
        default void accept(Visitor visitor) {
            visitor.visitCompositeElement(this);
        }
    }

    protected interface Visitor {
        void visitElement(Element element);

        void visitCompositeElement(CompositeElement element);
    }
}
