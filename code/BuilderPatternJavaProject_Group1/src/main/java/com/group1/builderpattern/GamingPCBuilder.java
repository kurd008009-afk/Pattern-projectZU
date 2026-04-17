package com.group1.builderpattern;

public class GamingPCBuilder implements ComputerBuilder {
    private final Computer computer;

    public GamingPCBuilder() {
        this.computer = new Computer();
        this.computer.setBuildType("Gaming PC");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Intel Core i9-1994900K");
    }

    @Override
    public void buildRAM() {
        computer.setRam("32 GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2 TB NVMe SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("NVIDIA RTX 4080");
    }

    @Override
    public void buildCooling() {
        computer.setCooling("Liquid Cooling");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("850W 80+ Gold");
    }

    @Override
    public void buildCaseType() {
        computer.setCaseType("Full Tower RGB Case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
