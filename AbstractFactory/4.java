package AbstractFactory;

public class PC extends Computer{ //declare PC class which extends Computer 
    private String ram; //declare variables 
 private String hdd;
 private String cpu;

 public PC(String ram, String hdd, String cpu){ //method for declare variables 
 this.ram=ram;
 this.hdd=hdd;
 this.cpu=cpu;
 }
 @Override //override getting methods 
 public String getRAM() {
 return this.ram;
 }

 @Override
 public String getHDD() {
 return this.hdd;
 }

 @Override
 public String getCPU() {
 return this.cpu;
 }
}
