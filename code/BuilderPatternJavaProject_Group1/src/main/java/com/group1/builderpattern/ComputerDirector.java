package com.group1.builderpattern;

public class ComputerDirector {
    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildGPU();
        builder.buildCooling();
        builder.buildPowerSupply();
        builder.buildCaseType();
    }
}
