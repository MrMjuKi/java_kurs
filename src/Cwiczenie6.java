public class Cwiczenie6 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 4, 1, 2, 9, 3, 0, 6, 4, 8};

        //Zadanie polega na posortowaniu liczb w tabeli numbers:
        //a) rosnąco
        //b) malejąco

        //a) rosnąco
        // 1. Pierwsza pętla bierze pod lubę kolejne wertości z tabeli
        // 2. Wybraną wartość określa jako minimalną
        // 3. Wybraną wartośc porównuje z pozostałymi wartościami w tabeli za pomocą drugiej pętli
        // 4. Jeśli znajdzie mniejszą wartość to określa ją jako nową najmniejszą wartość i zamienia położenie starej i nowej najmniejszej wartości

        for (int i = 0; i < numbers.length-1; i++) {
            int min = numbers[i];
            for ( int j = i+1; j < numbers.length; j++ ) {
                if(min>numbers[j]) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;

                }
            }
        }

        System.out.println("Wynik rosnąco:");
        for (int k : numbers) {
            System.out.print(k + ", ");
        }

        //a) malejąco
        // 1. Pierwsza pętla bierze pod lubę kolejne wertości z tabeli
        // 2. Wybraną wartość określa jako minimalną
        // 3. Wybraną wartośc porównuje z pozostałymi wartościami w tabeli za pomocą drugiej pętli
        // 4. Jeśli znajdzie mniejszą wartość to określa ją jako nową najmniejszą wartość i zamienia położenie starej i nowej najmniejszej wartości

        for (int i = 0; i < numbers.length-1; i++) {
            int max = numbers[i];
            for ( int j = i+1; j < numbers.length; j++ ) {
                if(max<numbers[j]) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;

                }
            }
        }

        System.out.println(System.lineSeparator() + "Wynik malejąco:");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

    }
}
