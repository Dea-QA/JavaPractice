package OOP3;

public class Main {
    public static void main(String[] args) {

        Radnik fizikalac = new Radnik(23,"fizikalac", 2,1000.0);
        Radnik investitor = new Radnik(24,"investitor", 5, 1300.0 );
        Radnik sefSmene = new Radnik(25, "sef smene", 7,1200.0 );

        Fizikalac f1 = new Fizikalac(fizikalac.idRadnika, fizikalac.nazivRadnika, fizikalac.godineIskustva, fizikalac.plata);
        f1.stampa();
        Investitor i1 = new Investitor(investitor.idRadnika, investitor.nazivRadnika, investitor.godineIskustva, investitor.plata, 5);
        i1.stampa();
        SefSmene s1 = new SefSmene(sefSmene.idRadnika, sefSmene.nazivRadnika, sefSmene.godineIskustva, sefSmene.plata);
        s1.stampa();

    }
}
