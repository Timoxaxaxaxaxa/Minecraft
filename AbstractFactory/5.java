package AbstractFactory;

import AbstractFactory.Computer;
import AbstractFactory.PC;

public class PCFactory implements ComputerAbstractFactory { //declare PCFactory which implements abstract class 
    private String ram; //declare private variables 
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) { //method for PCFactory variables 
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override //override Computer class which createComputer  for PC
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
