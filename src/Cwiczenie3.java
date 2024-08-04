import Cwiczenie3KlasaBug.Bug;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cwiczenie3 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n");

        Bug zadanie1 = new Bug ("Testowy opis 123", "test@test.test", 5);
        Bug zadanie2 = new Bug ("Testowy opis 456", "test2@test2.test2", 3);

        zadanie1.printData();

        zadanie2.printEmail();
        zadanie2.printPriority();
        zadanie2.printStatus();

        zadanie1.setDescription("test");
        zadanie1.setEmail("nowy@email.pl");
        System.out.println("\n--------------------------------\n");
        System.out.println( zadanie1.getEmail() );
        System.out.println( zadanie1.getStatus() );
        zadanie1.setStatus("Zamknięty");
        System.out.println( zadanie1.getStatus() );
    }
}