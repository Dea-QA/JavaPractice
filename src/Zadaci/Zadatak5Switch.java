package Zadaci;

import java.util.Scanner;

public class Zadatak5Switch {

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
        int starostKnjige = 2023 - godIzdanja;


        switch (zanr.toLowerCase()) {

            case "romantika", "triler":
                if (starostKnjige > 30) {
                    System.out.println("Zanr knjige vise nije na lageru");
                } else if (starostKnjige<0) {
                    System.out.println("Pogresan unos");
                } else {
                    System.out.println("Na lageru");
                }
                break;


            case ("horor"):
                if (starostKnjige > 40) {
                    System.out.println("Zanr knjige vise nije na lageru");
                } else if (starostKnjige<0) {
                    System.out.println("Pogresan unos");
                } else {
                    System.out.println("Na lageru");
                }
                break;


            case ("krimi"):
                if (starostKnjige > 20) {
                    System.out.println("Zanr knjige vise nije na lageru");
                } else if (starostKnjige<0) {
                    System.out.println("Pogresan unos");
                } else {
                    System.out.println("Na lageru");
                }
                break;


            default:
                System.out.println("Pogresan unos");
                break;

        }
    }
}