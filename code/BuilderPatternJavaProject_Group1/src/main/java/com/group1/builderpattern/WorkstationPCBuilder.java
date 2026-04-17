package com.group1.builderpattern;

public class WorkstationPCBuilder implements ComputerBuilder {
    private final Computer computer;

    public WorkstationPCBuilder() {
        this.computer = new Computer();
        this.computer.setBuildType("Workstation PC");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("AMD Ryzen 9 7950X");
    }

    @Override
    public void buildRAM() {
        computer.setRam("64 GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("4 TB NVMe SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("NVIDIA RTX A4000");
    }

    @Override
    public void buildCooling() {
        computer.setCooling("High Performance Liquid Cooling");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("1000W 80+ Platinum");
    }

    @Override
    public void buildCaseType() {
        computer.setCaseType("Professional Full Tower Case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
