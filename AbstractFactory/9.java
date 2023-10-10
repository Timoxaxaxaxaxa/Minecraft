package AbstractFactory;

public abstract class Computer {

    public abstract String getRAM();  // declare abstract variable

    public abstract String getHDD(); 

    public abstract String getCPU(); 

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ",CPU=" + this.getCPU(); //returns values 
    }
}
