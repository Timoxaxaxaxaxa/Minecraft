package AbstractFactory;

public class ServerFactory implements ComputerAbstractFactory{ //declare ServerFactory which implements abstract class 
    private String ram; //declare private variables
 private String hdd;
 private String cpu;

 public ServerFactory(String ram, String hdd, String cpu){ //method for ServerFactory variables 
 this.ram=ram;
 this.hdd=hdd;
 this.cpu=cpu;
 }

 @Override
 public Computer createComputer() { //override Computer class which createComputer for Server
 return new Server(ram,hdd,cpu);
 }
}
