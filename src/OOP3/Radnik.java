package OOP3;

public class Radnik {
    //Napraviti klasu Radnik koja ima atribute: id, naziv radnika, godine iskustva i plata.
    // Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik.
    // Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
    // Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu,
    // ako imaju vise od 5 godina iskustva, i 30% vecu platu investitoru ako je digao bar 5 zgrada.

    int idRadnika;
    String nazivRadnika;
    int godineIskustva;
    double plata;

    public Radnik(int idRadnika, String nazivRadnika, int godineIskustva, double plata) {
        this.idRadnika = idRadnika;
        this.nazivRadnika = nazivRadnika;
        this.godineIskustva = godineIskustva;
        this.plata = plata;
    }
}
