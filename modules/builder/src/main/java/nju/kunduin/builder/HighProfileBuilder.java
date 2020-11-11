package nju.kunduin.builder;

/** @author kunduin */
public class HighProfileBuilder implements ComputerBuilder {
    private String cpu;
    private String gpu;
    private String memory;
    private String hardDisk;

    @Override
    public ComputerBuilder setCpu() {
        this.cpu = "AMD Ryzen 4700G";
        return this;
    }

    @Override
    public ComputerBuilder setGpu() {
        this.gpu = "AMD Radeon RX 6900xt";
        return this;
    }

    @Override
    public ComputerBuilder setMemory() {
        this.memory = "32G";
        return this;
    }

    @Override
    public ComputerBuilder setHardDisk() {
        this.hardDisk = "1T";
        return this;
    }

    @Override
    public Computer buildComputer() {
        return new Computer(this.cpu, this.gpu, this.memory, this.hardDisk);
    }
}
