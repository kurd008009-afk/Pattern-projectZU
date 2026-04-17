package com.group1.builderpattern;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String cooling;
    private String powerSupply;
    private String caseType;
    private String buildType;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    @Override
    public String toString() {
        return "Build Type: " + buildType + System.lineSeparator() +
                "CPU: " + cpu + System.lineSeparator() +
                "RAM: " + ram + System.lineSeparator() +
                "Storage: " + storage + System.lineSeparator() +
                "GPU: " + gpu + System.lineSeparator() +
                "Cooling: " + cooling + System.lineSeparator() +
                "Power Supply: " + powerSupply + System.lineSeparator() +
                "Case Type: " + caseType;
    }
}
