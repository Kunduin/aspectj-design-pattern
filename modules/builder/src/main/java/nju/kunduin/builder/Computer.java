package nju.kunduin.builder;

/** @author kunduin */
public class Computer {
    private String cpu;
    private String gpu;
    private String memory;
    private String hardDisk;

    public Computer(String cpu, String gpu, String memory, String hardDisk) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "cpu='"
                + cpu
                + '\''
                + ", gpu='"
                + gpu
                + '\''
                + ", memory='"
                + memory
                + '\''
                + ", hardDisk='"
                + hardDisk
                + '\''
                + '}';
    }
}
