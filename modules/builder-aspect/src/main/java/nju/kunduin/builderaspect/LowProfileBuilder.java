package nju.kunduin.builderaspect;

/** @author kunduin */
public class LowProfileBuilder implements ComputerBuilder {

    @Override
    public ComputerBuilder setCpu() {
        computer.setCpu("AMD Ryzen 4300G");
        return this;
    }

    @Override
    public ComputerBuilder setGpu() {
        computer.setGpu("AMD Radeon RX 6800");
        return this;
    }

    @Override
    public ComputerBuilder setMemory() {
        computer.setMemory("16G");
        return this;
    }

    @Override
    public ComputerBuilder setHardDisk() {
        computer.setHardDisk("512G");
        return this;
    }
}
