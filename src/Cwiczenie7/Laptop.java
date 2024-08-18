package Cwiczenie7;

public class Laptop extends Computer{

    private int batteryLevel;

   //konstruktor matki + nowa zmienna dziecka
    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    //nadpisywanie metody matki + wywolywanie metody matki
    @Override
    public void switchOn(){
        System.out.println("Checking battery level ...");
        if(batteryLevel > 0){
            System.out.println("Battery level is good");
            super.switchOn();
        } else {
            System.out.println("Battery level is too low");
        }
    }

    public void setBatteryLevel(int newBatteryLevel){
        batteryLevel = newBatteryLevel;
    }
}
