package nju.kunduin.composite;

import java.util.Optional;

/** @author kunduin */
public interface Component {
    void addChild(Component component);

    void removeChild(Component component);

    Optional<Component> getChild(int i);

    void operation();
}
