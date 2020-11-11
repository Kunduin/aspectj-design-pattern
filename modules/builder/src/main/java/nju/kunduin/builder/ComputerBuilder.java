package nju.kunduin.builder;

/** @author kunduin */
public interface ComputerBuilder {

    ComputerBuilder setCpu();

    ComputerBuilder setGpu();

    ComputerBuilder setMemory();

    ComputerBuilder setHardDisk();

    Computer buildComputer();
}
