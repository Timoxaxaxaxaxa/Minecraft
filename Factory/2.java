package Factory; //connect package

import Factory.Computer; //import other classes from this project
import Factory.PC;
import Factory.Server;

public class ComputerFactory { // declare class
    public static Computer getComputer(String type, String ram, String hdd, String cpu) { // class which accept
                                                                                          // variables and returning
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu); // condition when PC equals with variable and return new PC values
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram,
                    hdd, cpu); // condition when Server equals with variable and return new Server values

        return null; // if all condition are false
    }
}