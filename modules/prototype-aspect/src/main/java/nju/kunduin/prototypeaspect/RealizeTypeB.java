package nju.kunduin.prototypeaspect;

import java.util.Optional;

/** @author kunduin */
public class RealizeTypeB {
    private Optional<String> name;
    private Optional<String> weight;

    public Optional<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Optional.ofNullable(name);
    }

    public Optional<String> getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = Optional.ofNullable(weight);
    }

    @Override
    public String toString() {
        return "RealizeTypeB{" + "name=" + name + ", weight=" + weight + '}';
    }
}
