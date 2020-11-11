package nju.kunduin.builder;

/** @author kunduin */
public class LowProfileBuilder implements ComputerBuilder {
    private String cpu;
    private String gpu;
    private String memory;
    private String hardDisk;

    @Override
    public ComputerBuilder setCpu() {
        this.cpu = "AMD Ryzen 4300G";
        return this;
    }

    @Override
    public ComputerBuilder setGpu() {
        this.gpu = "AMD Radeon RX 6800";
        return this;
    }

    @Override
    public ComputerBuilder setMemory() {
        this.memory = "16G";
        return this;
    }

    @Override
    public ComputerBuilder setHardDisk() {
        this.hardDisk = "512G";
        return this;
    }

    @Override
    public Computer buildComputer() {
        return new Computer(this.cpu, this.gpu, this.memory, this.hardDisk);
    }
}
