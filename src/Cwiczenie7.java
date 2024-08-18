import Cwiczenie7.PC;
import Cwiczenie7.Laptop;
import Cwiczenie7.PC;
public class Cwiczenie7 {

    public static void main(String[] args) {

        Laptop lap = new Laptop("Laptop l", "Laptop", 250, 16, 1);
        PC pc = new PC("Laptop l", "Laptop", 250, 16, true);

        lap.switchOn();
        System.out.println("--------------------------------");
        pc.switchOn();


    }
}
