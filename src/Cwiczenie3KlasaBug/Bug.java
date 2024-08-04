package Cwiczenie3KlasaBug;

public class Bug {

    //Pola obiektu
    private String description;
    private String email;
    private int priority;
    private String status;

    //Konstruktor
    public Bug (String description, String email, int priority){
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = "Otwarty";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if( description.length() >= 10 )
            this.description = description;
        else
            System.out.println("Opis jest zbyt krótki. Musi mieć min. 10 znaków.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".pl"))
            this.email = email;
        else
            System.out.println("E-mail nie zawiera symbolów @ lub .pl.");
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5)
            this.priority = priority;
        else
            System.out.println("Priorytet musi zawierać się w przedziale od 1 do 5 włącznie.");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if( status.equals("Otwarty") || status.equals("Zamknięty") )
            this.status = status;
        else
            System.out.println("Status może być tylko \"Otwarty\" lub \"Zamknięty\".");
    }

    //metody
    public void printData(){
        System.out.println("Opis: " + description);
        System.out.println("E-mail: " + email);
        System.out.println("Priorytet: " + priority);
        System.out.println("Status: " + status);
    }

    public void printEmail(){
        System.out.println("E-mail zgłaszającej osoby: " + email);
    }

    public void printStatus(){
        System.out.println("Status: " + status);
    }

    public void printPriority(){
        System.out.println("Priorytet: " + priority);
    }
}
