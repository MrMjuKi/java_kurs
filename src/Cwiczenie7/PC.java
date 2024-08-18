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

}
