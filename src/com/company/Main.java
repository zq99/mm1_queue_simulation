package com.company;

public class Main {


    public static void main(String[] args) {

        /* Demo of running the simulation */

        Simulation simulation = new Simulation(4,5,10000);
        Result result = simulation.run();
        Export.output(result,"results.csv");
    }


}