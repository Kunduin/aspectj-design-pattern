package nju.kunduin.builderaspect;

/** @author kunduin */
public interface ComputerBuilder {

    ComputerBuilder setCpu();

    ComputerBuilder setGpu();

    ComputerBuilder setMemory();

    ComputerBuilder setHardDisk();
}
