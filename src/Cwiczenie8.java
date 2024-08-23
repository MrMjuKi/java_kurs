import Cwiczenie7.PC;
import Cwiczenie7.Laptop;
import Cwiczenie7.Computer;

public class Cwiczenie8 {

    public static void main(String[] args) {

        Computer A = new PC("Computer A", "Computer", 16, 256, false);
        Computer B = new Laptop("Laptop B", "Laptop", 32, 512, 100);

        System.out.println(A.volumeUp(11));
        System.out.println(A.volumeDown(2));

        System.out.println(B.volumeDown(4));
        System.out.println(B.volumeUp(35));
        System.out.println(B.volumeUp(110));
        System.out.println(B.volumeDown(100));
    }
}
