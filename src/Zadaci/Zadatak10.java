package Zadaci;

import java.util.Scanner;

public class Zadatak10 {

    //3. Napraviti program za korpu voca. Izracunati sumu cena, ako znamo da jabuke kostaju
    // 50 din, kruske 100 din i banane 140 din, tako da se suma racuna sve dok unosimo "jabuka",
    // "banana" ili "kruska". U zavisnosti od toga koji String unesemo, toliko dodajemo na sumu.
    // Kada se unese ".", program izlazi iz petlje i pise ukupnu cenu navedenog voca.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jabuka = "jabuka";
        String kruska = "kruska";
        String banana = "banana";
        String nazivVoca = "";

        int cenaJabuke = 50;
        int cenaKruske = 100;
        int cenaBanane = 140;

        int suma = 0;
        while (!nazivVoca.equals(".")) {

            System.out.println("U korpu dodati voce:  ");
            nazivVoca = sc.next();

                if (nazivVoca.equalsIgnoreCase(jabuka)) {
                    System.out.println("Cena izabranog voca je: " + cenaJabuke + " din.");
                    suma = suma + cenaJabuke;

                } else if (nazivVoca.equalsIgnoreCase(kruska)) {
                    System.out.println("Cena izabranog voca je: " + cenaKruske + " din.");
                    suma = suma + cenaKruske;

                } else if (nazivVoca.equalsIgnoreCase(banana)) {
                    System.out.println("Cena izabranog voca je: " + cenaBanane + " din.");
                    suma = suma + cenaBanane;
                }

            System.out.println("Ukupna cena vase korpe voca iznosi: " + suma + " din.");

            }
        }
    }


