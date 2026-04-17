package com.group1.builderpattern;

public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    void buildCooling();
    void buildPowerSupply();
    void buildCaseType();
    Computer getComputer();
}
