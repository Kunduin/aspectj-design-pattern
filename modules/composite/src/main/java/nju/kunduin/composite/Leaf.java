package nju.kunduin.composite;

import java.util.Optional;

/** @author kunduin */
public class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component component) {}

    @Override
    public void removeChild(Component component) {}

    @Override
    public Optional<Component> getChild(int i) {
        return Optional.empty();
    }

    @Override
    public void operation() {
        System.out.println(this + "[" + name + "]" + ": run operation");
    }
}
