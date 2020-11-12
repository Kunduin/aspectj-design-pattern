package nju.kunduin.visitor;

import java.util.ArrayList;
import java.util.List;

/** @author kunduin */
public class DataStruct {
    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}
