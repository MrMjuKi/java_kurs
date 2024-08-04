public class Cwiczenie2 {

    //Main run class, shortcut: psvm
    public static void main(String[] args) {

        //shortcut: sout
        System.out.println("Hello World!");

        //liczba calkowita
        int liczbaCalkowita = 10;
        System.out.println(liczbaCalkowita);

        //liczba zmienno-przecinkowa
        double liczbaZmiennoprzecinkowa = 10.1;
        System.out.println(liczbaZmiennoprzecinkowa);

        //zwykly tekst
        String zwyklyTekst = "Hello World!";
        System.out.println(zwyklyTekst);

        //pojedynczy znak (moze byc litera lub cyfra)
        char pojedynczyZnak = 'a';
        System.out.println(pojedynczyZnak);

        //wartosc true
        boolean wartoscTrue = true;
        System.out.println(wartoscTrue);

        //wartosc false
        boolean wartoscFalse = false;
        System.out.println(wartoscFalse);

        //operatory matematyczne
        System.out.println(10 + 5.0);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 4); //wynikiem bedzie 2 zamiast 2.5 bo dzielimy 2 zmienne calkowite
        System.out.println(10.0 / 4); //wynikiem bedzie 2.5 bo dzielimy zmienna zmiennoprzecinkowa przez zmienna calkowita

        //operatory porownania
        System.out.println(10 < -2);
        System.out.println(10 > 3);
        System.out.println(10 == 11);
        System.out.println(10 != 11);
        System.out.println(10 <= -2);
        System.out.println(10 >= -2);

        //operatory logiczne
        System.out.println(false); //wynikiem bedzie false bo false && true = false
        System.out.println(true); //wynikiem bedzie true bo true && true = true
        System.out.println(false); //wynikiem bedzie false bo false & true = false

        System.out.println(true); //wynikiem bedzie true bo false || true = true
        System.out.println(true); //wynikiem bedzie true bo true || true = true DRUGI WARUNEK NIE BEDZIE SPRAWDZANY JESLI PIERWSZY JEST TRUE
        System.out.println(false); //wynikiem bedzie false bo false || false = false

        System.out.println(10.0 % 3);
    }
}
