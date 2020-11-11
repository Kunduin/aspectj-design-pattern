package nju.kunduin.builderaspect;

/** @author kunduin */
public aspect ComputerBuilderAspect {

    public Computer ComputerBuilder.computer = new Computer();

    public Computer ComputerBuilder.buildComputer() {
        return computer;
    }
}
