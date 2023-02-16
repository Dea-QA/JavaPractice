package OOP3;

public class Investitor extends Radnik {

    int brojZgrada;

    public Investitor(int idRadnika, String nazivRadnika, int godineIskustva, double plata, int brojZgrada) {
        super(idRadnika, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public void stampa() {
        if (brojZgrada >= 5) {
            plata = plata * 1.3;
            System.out.println("Radnik sa id-jem " + idRadnika + ", na poziciji " + nazivRadnika + ", sa " +
                    godineIskustva + " godina iskustva, ima platu " + plata + " evra.");
        } else {
            System.out.println("Radnik sa id-jem " + idRadnika + ", na poziciji " + nazivRadnika + ", sa " +
                    godineIskustva + " godina iskustva, ima platu " + plata + " evra.");
        }
    }
}