package nju.kunduin.builderaspect;

/** @author kunduin */
public class Main {
    public static void main(String[] args) {
        ComputerBuilder highProfileBuilder = new HighProfileBuilder();
        Director highProfileDirectory = new Director(highProfileBuilder);
        Computer highProfileComputer = highProfileDirectory.buildComputer();
        System.out.println(highProfileComputer);

        ComputerBuilder lowProfileBuilder = new LowProfileBuilder();
        Director lowProfileDirectory = new Director(lowProfileBuilder);
        Computer lowProfileComputer = lowProfileDirectory.buildComputer();
        System.out.println(lowProfileComputer);
    }
}
