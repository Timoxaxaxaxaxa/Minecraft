package Factory; //connect package

public abstract class Computer { // abstract class for computer 

 public abstract String getRAM(); //getting value
 public abstract String getHDD();//getting value
 public abstract String getCPU();//getting value

 @Override //superclass 
 public String toString(){ //return in string format
 return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU(); //show values with othes words
 }
}