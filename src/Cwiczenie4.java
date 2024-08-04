public class Cwiczenie4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        //Zadanie polega na zmianie miejsca pierwszej i ostatniej wartości w tabeli wykorzystując:
        //a) jedna zmienną
        //b) zero zmiennych

        //a) Rozwiązanie:
        //  1. Pod zmienną podstawić wartość pierwszego indeksu.
        //  2. W tabeli wartość ostatniego ineksu podstawić pod pierwszy indeks.
        //  3. Pod ostatni indeks postawić wartość ze zmiennej.
        int number = numbers[0];

        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = number;

        for(int i: numbers) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        int[] cyfry = {1, 2, 3, 4, 5};

        // b) Rozwiązanie:
        // 1. Pod ostatni indeks podstawićy sumę wartości pierwszego i ostatniego indeksu.
        // 2. Pod pierwszy index podstawić różnicę sumy z ostatniego indeksu i wartość pierwszego indeksu.
        // 3. Pod ostatni index podstawić róźnicę sumy z ostatniego indeksu i wartość ostatniego indeksu.

        int sum = cyfry[0] + cyfry[cyfry.length - 1];

        cyfry[0] = sum - cyfry[0];
        cyfry[cyfry.length - 1] = sum - cyfry[cyfry.length - 1];

        for (int i : cyfry) {
            System.out.println(i);
        }
    }
}
