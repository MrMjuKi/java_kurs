public class Cwiczenie5 {
    public static void main(String[] args) {

        int[] numbers = {2, 6, 8, 7, 7, 7, 1, 3, 9, 0, 0, 7};

        //Zadanie polega na zweryfikowaniu ile licz parzystych i nieparzystych mieści się w tabeli numbers

        int evenCount = 0;
        int oddCount = 0;

        for (int i : numbers) {
            if (i % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Naliczono " + evenCount + " liczb parzystych");
        System.out.println("Naliczono " + oddCount + " liczb nieparzystych");
    }
}
