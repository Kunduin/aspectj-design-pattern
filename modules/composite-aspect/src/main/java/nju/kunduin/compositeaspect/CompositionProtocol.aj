package nju.kunduin.compositeaspect;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

/** @author kunduin */
public abstract aspect CompositionProtocol {
    public interface Component {
    }

    protected interface Composite extends Component {
    }

    protected interface Leaf extends Component {
    }

    private final WeakHashMap<Component, List<Component>> perComponentChildren = new WeakHashMap();

    private List<Component> getChildren(Component s) {
        return perComponentChildren.computeIfAbsent(s, k -> new ArrayList<>());
    }

    public void addChild(Object composite, Object component) {
        getChildren((Composite) composite).add((Component) component);
    }

    public void removeChild(Composite composite, Component component) {
        getChildren(composite).remove(component);
    }

    public List<Component> getAllChildren(Component c) {
        return getChildren(c);
    }

    public interface Visitor {
        void doOperation(Component c);
    }

    public void recurseOperation(Component c, Visitor v) {
        getAllChildren(c).forEach(v::doOperation);
    }

    public interface FunctionVisitor {
        Object doFunction(Component c);
    }

    public List<Object> recurseFunction(Component c, FunctionVisitor fv) {
        return getAllChildren(c).stream()
                .map(fv::doFunction)
                .collect(Collectors.toList());
    }
}
