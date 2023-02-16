package OOP2;

public class Main {
    //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika,
    // proveriti cija je plata veca, i istampati informacije radnika cija je plata veca, uz 20% vecu platu.

    public static void main(String[] args) {

        Radnik radnik1 = new Radnik("Pera", "Peric", "fizikalac", 1000);
        Radnik radnik2 = new Radnik("Mita", "Mitic", "inzenjer", 1500 );



        if (radnik1.plata > radnik2.plata) {
            radnik1.plata = radnik1.plata * 1.2;
            radnik1.stampa();
        } else if ( radnik1.plata < radnik2.plata) {
            radnik2.plata = radnik2.plata * 1.2;
            radnik2.stampa();
        }
    }
}
