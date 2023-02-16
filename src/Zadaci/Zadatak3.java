package Zadaci;

import java.util.Scanner;

public class Zadatak3 {
   /*
    Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac", "inzenjer"
    i "masinovodja" i uneti svoju platu. Ispisati u konzoli poziciju koju radis i platu.
    Ako ste na poziciji fizikalca, povecati platu za 15%.
    Ako ste na poziciji inzenjera, povecati platu za 20%.
    Ako ste na poziciji masinovodje, povecati platu za 30%.
    Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite radnu poziciju: ");
        String radnaPozicija = sc.next();

        System.out.println("Unesite platu: ");
        double plata = sc.nextDouble();

        double plataFizikalcaNoviIznos = plata * 1.15;
        double plataInzenjeraNoviIznos = plata * 1.2;
        double plataMasinovodjeNoviIznos = plata * 1.3;

        if (radnaPozicija.equalsIgnoreCase("fizikalac")) {
            System.out.println("Vaša plata sada je: " + plataFizikalcaNoviIznos);
        } else if (radnaPozicija.equalsIgnoreCase("inzenjer")) {
            System.out.println("Vaša plata sada je: " + plataInzenjeraNoviIznos);
        } else if (radnaPozicija.equalsIgnoreCase("masinovodja")) {
            System.out.println("Vaša plata sada je: " + plataMasinovodjeNoviIznos);
        } else {
            System.out.println("Neispravan unos");
        }
    }
}

