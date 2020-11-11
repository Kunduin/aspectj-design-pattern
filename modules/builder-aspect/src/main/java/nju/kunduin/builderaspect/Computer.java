package nju.kunduin.builderaspect;

/** @author kunduin */
public class Computer {
    private String cpu;
    private String gpu;
    private String memory;
    private String hardDisk;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
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
