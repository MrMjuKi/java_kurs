package Cwiczenie7;

// Cwiczenie dziedziczenia miedzy klasa matka Computer i dziecmi PC i Laptop
abstract public class Computer {
    // Pola zdefiniowane i uzywane przez dziedziczone klasy MUSZA być protected nie privated
    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void switchOn(){
        state = true;
    }

    public void switchOff(){
        state = false;
    }

    public boolean getState(){
        return state;
    }

    public abstract int volumeUp(int value);
    public abstract int volumeDown(int value);
}
