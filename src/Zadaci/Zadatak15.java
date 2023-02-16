package Zadaci;

import java.util.Scanner;

public class Zadatak15 {
    //Napraviti proizvoljan niz imena. Zatim, napraviti metod koji ce kao parametre primati niz imena
    // i String koji zelimo da proverimo. Ispisati poruku ukoliko se ime nalazi u nizu,
    // obavestiti ako nije tu (ime za proveru vi unosite).


    public static void main(String[] args) {

        String niz1[] = {"Ana", "Dubravka", "Marija", "Mitar", "Petar", "Veljko"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = sc.nextLine();

        if (proveraImena(ime, niz1)) {
            System.out.println("Ime " + ime + " se nalazi u nizu.");

        } else {
            System.out.println("Ime " + ime + " se ne nalazi u nizu.");

        }
    }

    public static boolean proveraImena(String s, String niz[]) {

        boolean contained = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equals(s)) {
                contained = true;
                break;
            }
            }
        return contained;
        }
    }


