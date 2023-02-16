package OOP2;

public class Radnik {
    //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika,
    // proveriti cija je plata veca, i istampati informacije radnika cija je plata veca, uz 20% vecu platu.

    String ime;
    String prezime;
    String pozicija;
    double plata;


    public Radnik(String ime, String prezime, String pozicija, int plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.pozicija = pozicija;
        this.plata = plata;


    }

    public void stampa() {

        System.out.println("Radnik " + this.ime + " " + this.prezime + " je na poziciji " + this.pozicija + ". Njegova plata iznosi " + plata + " evra.");
    }
}
