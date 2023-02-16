package OOP4;

import java.util.ArrayList;

import static OOP4.Jelo.proveraLaktoze;

public class Main {
    public static void main(String[] args) {

        Jelo corba = new Jelo("corba", new ArrayList<String>(), proveraLaktoze());
        corba.listaSastojaka.add("meso");
        corba.listaSastojaka.add("povrce");
        corba.listaSastojaka.add("mleko");
        corba.stampa();


        Jelo torta = new Jelo("torta", new ArrayList<String>(), proveraLaktoze());
        torta.listaSastojaka.add("brasno");
        torta.listaSastojaka.add("lesnik");
        torta.listaSastojaka.add("secer");
        torta.listaSastojaka.add("jaja");
        torta.listaSastojaka.add("cokolada");
        torta.listaSastojaka.add("mleko");
        torta.listaSastojaka.add("maslac");
        torta.stampa();

        Jelo sarma = new Jelo("sarma", new ArrayList<String>(), proveraLaktoze());
        sarma.listaSastojaka.add("kiseli kupus");
        sarma.listaSastojaka.add("meso");
        sarma.listaSastojaka.add("pirinac");
        sarma.listaSastojaka.add("povrce");
        sarma.stampa();


    }
}
