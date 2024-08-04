public class Cwiczenie1 {
    public static void main(String[] args) {
        int zmienna1 = 11;
        int zmienna2 = 44;
        int zmienna3 = 66;
        int zmienna4 = 100;

        if ((zmienna1 + zmienna2)%2 == 0 &&  (zmienna3 + zmienna4)%2 == 0){
            System.out.println("Dwie sumy są parzyste");
        } else if ((zmienna1 + zmienna2)%2 == 0) {
            System.out.println("Pierwsza suma jest parzysta");
        } else if ((zmienna3 + zmienna4)%2 == 0) {
            System.out.println("Druga suma jest parzysta");
        }

    }
}
