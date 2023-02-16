package Zadaci;

import java.util.Scanner;

public class Zadatak5IfElse {

     /* 2. Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi). Nakon toga,
    uneti neku godinu izdanja knjige. Ukoliko su Triler i Romantika, stariji od 30 godina, onda treba
    ispisati poruku da zanr knjige vise nije na lageru. Takodje, ako je Horor stariji od 40 godina i ako je
    Krimi stariji od 20 godina. Ukoliko zanr nije stariji od navedenih ogranicenja, ispisati poruku da je zanr knjige na lageru.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv zanra (romantika/triler/horor/krimi): ");
        String zanr = sc.next();
        System.out.println("Unesite godinu izdanja: ");
        int godIzdanja = sc.nextInt();

        if(godIzdanja>2023) {
            System.out.println("Greška");
        } else if ((zanr.equalsIgnoreCase("triler") || zanr.equalsIgnoreCase("romantika"))
                && godIzdanja < 1992) {
            System.out.println("Zanr knjige vise nije na lageru");
        } else if(zanr.equalsIgnoreCase("horor") && godIzdanja<1982) {
            System.out.println("Zanr knjige vise nije na lageru");
        } else if (zanr.equalsIgnoreCase("krimi") && godIzdanja<2002) {
            System.out.println("Zanr knjige vise nije na lageru");
        } else {
            System.out.println("Na lageru");

        }

    }

}