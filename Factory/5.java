package Factory; //connect package

import AbstractFactory.PCFactory;
import AbstractFactory.ServerFactory;
import Factory.ComputerFactory;
import Factory.Computer;
//import other classes from this project

public class TestFactory { // main class TestFactory
    public static void main(String[] args) { // main method
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", "2.4 GHz"); // declare vaues for PC
        Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB", "2.9 GHz"); // declare vaues for Server
        System.out.println("Factory PC Config::" + pc); // print ibfo about PC
        System.out.println("Factory Server Config::" + server); // print ibfo about Server
    }
}