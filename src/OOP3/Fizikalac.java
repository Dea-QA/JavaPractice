package OOP3;

public class Fizikalac extends Radnik {

    public Fizikalac(int idRadnika, String nazivRadnika, int godineIskustva, double plata) {
        super(idRadnika, nazivRadnika, godineIskustva, plata);
    }

    public void stampa() {
        if (godineIskustva > 5) {
            plata = plata * 1.2;
            System.out.println("Radnik sa id-jem " + idRadnika + ", na poziciji " + nazivRadnika + ", sa " +
                    godineIskustva + " godina iskustva, ima platu " + plata + " evra.");
        } else {
            System.out.println("Radnik sa id-jem " + idRadnika + ", na poziciji " + nazivRadnika + ", sa " +
                    godineIskustva + " godina iskustva, ima platu " + plata + " evra.");

        }
    }
}
