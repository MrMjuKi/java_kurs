package Cwiczenie7;

public class PC extends Computer{

    private boolean turnOn;

    //konstruktor matki + nowa zmienna dziecka
    public PC(String name, String type, int hdd, int ram, boolean turnOn) {
        super(name, type, hdd, ram);
        this.turnOn = turnOn;
    }

    //nadpisywanie metody matki + wywolywanie metody matki
    @Override
    public void switchOn() {
        System.out.println("Checking if PC is on ...");
        if (turnOn) {
            System.out.println("PS in turn on");
            super.switchOn();
        } else {
            System.out.println("PS in turn off");
        }
    }

    @Override
    public int volumeUp(int value) {
        this.volumeLevel += value;
        if (100 <= this.volumeLevel) {
            return 100;
        } if (this.volumeLevel <=0) {
            return 0;
        }
        else {
            return this.volumeLevel;
        }
    }

    @Override
    public int volumeDown(int value) {
        this.volumeLevel -= value;
        if (100 <= this.volumeLevel) {
            return 100;
        } if (this.volumeLevel <=0) {
            return 0;
        }
        else {
            return this.volumeLevel;
        }
    }

}
