package Zadaci;

import java.util.Scanner;

public class Zadatak2 {
    /*Napisati program gde unosite godinu koje ste krenuli da radite(npr. 1998, 2001,..), zatim izracunavate godine
     radnog iskustva. Ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer (Napraviti ispis
     "Ti si Junior programer"). Ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer ("Ti si
     Senior programer"), ako imate vise od 8 godina onda ste direktor firme("Vi ste direktor firme").*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu u kojoj ste počeli da radite: ");
        int godinaZaposlenja = sc.nextInt();
        int tekucaGodina = 2022;
        int staz = tekucaGodina - godinaZaposlenja;


        if (godinaZaposlenja > 1950 && godinaZaposlenja < 2023) {
            if (staz >= 8) {
                System.out.println("Vi ste direktor.");
            } else if (staz > 4) {
                System.out.println("Vi ste senior.");
            } else {
                System.out.println("Vi ste junior.");
            }
        } else {
            System.out.println("Neispravan unos.");
        }
    }
}
