package com.group1.builderpattern;

public class Main {
    public static void main(String[] args) {
        buildAndPrint(new GamingPCBuilder());
        System.out.println("----------------------------------------");
        buildAndPrint(new OfficePCBuilder());
        System.out.println("----------------------------------------");
        buildAndPrint(new WorkstationPCBuilder());
    }

    private static void buildAndPrint(ComputerBuilder builder) {
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
