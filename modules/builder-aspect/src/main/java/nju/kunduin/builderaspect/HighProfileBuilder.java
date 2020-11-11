package nju.kunduin.builderaspect;

/** @author kunduin */
public class HighProfileBuilder implements ComputerBuilder {

    @Override
    public ComputerBuilder setCpu() {
        computer.setCpu("AMD Ryzen 4700G");
        return this;
    }

    @Override
    public ComputerBuilder setGpu() {
        computer.setGpu("AMD Radeon RX 6900xt");
        return this;
    }

    @Override
    public ComputerBuilder setMemory() {
        computer.setMemory("32G");
        return this;
    }

    @Override
    public ComputerBuilder setHardDisk() {
        computer.setHardDisk("1T");
        return this;
    }
}
