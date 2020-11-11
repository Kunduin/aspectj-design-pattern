package nju.kunduin.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** @author kunduin */
public class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    @Override
    public void addChild(Component component) {
        children.add(component);
    }

    @Override
    public void removeChild(Component component) {
        children.remove(component);
    }

    @Override
    public Optional<Component> getChild(int i) {
        try {
            return Optional.of(children.get(i));
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

    @Override
    public void operation() {
        children.forEach(Component::operation);
    }
}
