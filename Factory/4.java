package Factory; //connect package

import Factory.Computer;

public class Server extends Computer { // subclass Server extends class computer
    private String ram; // declaration of variables
    private String hdd;// declaration of variables
    private String cpu;// declaration of variables

    public Server(String ram, String hdd, String cpu) { // main code of subclass Server with variables
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() { // returning subclass varible
        return this.ram;
    }

    @Override
    public String getHDD() {// returning subclass varible
        return this.hdd;
    }

    @Override
    public String getCPU() {// returning subclass varible
        return this.cpu;
    }
}