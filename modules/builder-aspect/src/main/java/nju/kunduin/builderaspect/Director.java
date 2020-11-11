package nju.kunduin.builderaspect;

/** @author kunduin */
public class Director {

    private final ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        return computerBuilder.setCpu().setGpu().setMemory().setHardDisk().buildComputer();
    }
}
