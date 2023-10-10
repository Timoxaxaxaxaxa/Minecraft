package AbstractFactory;

import AbstractFactory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) { //method for return create Computer abstract class
        return factory.createComputer(); //returning method
    }
}
