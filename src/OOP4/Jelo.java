package OOP4;

import java.util.ArrayList;

public class Jelo {
    //Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
    // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko, podesicemo
    // boolean vrednost za laktozu na false, u suprotnom na true. U main klasi kreirati i istampati
    // bar tri jela (njihov naziv, sastojke i da li lactose-free).

    String naziv;
    static ArrayList<String> listaSastojaka = new ArrayList<>();
    boolean bezLaktoze;

    public Jelo(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        this.naziv = naziv;
        this.listaSastojaka = listaSastojaka;
        this.bezLaktoze = bezLaktoze;
    }

    public static boolean proveraLaktoze() {

        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (listaSastojaka.get(i).equals("mleko")) {
                return false;
            }
        }
        return true;
    }

    public void stampa() {

        System.out.println("Jelo " + naziv + " ima " + listaSastojaka + ". Jelo je lactose-free: " + proveraLaktoze());

    }
}
