package com.group1.builderpattern;

public class OfficePCBuilder implements ComputerBuilder {
    private final Computer computer;

    public OfficePCBuilder() {
        this.computer = new Computer();
        this.computer.setBuildType("Office PC");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Intel Core i5-13400");
    }

    @Override
    public void buildRAM() {
        computer.setRam("16 GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512 GB SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("Integrated Graphics");
    }

    @Override
    public void buildCooling() {
        computer.setCooling("Standard Air Cooling");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("500W 80+ Bronze");
    }

    @Override
    public void buildCaseType() {
        computer.setCaseType("Compact Mid Tower Case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
