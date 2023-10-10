package AbstractFactory;

import AbstractFactory.PCFactory;
import AbstractFactory.ServerFactory;
import AbstractFactory.Computer;
import AbstractFactory.ComputerFactory;

public class TestDesignPatterns {
    public static void main(String[] args) { //main function
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = AbstractFactory.ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz")); //getting values for abtrast classes
        Computer server = AbstractFactory.ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC Config::" + pc); //output pc with values
        System.out.println("AbstractFactory Server Config::" + server); //output server with values
    }
}
