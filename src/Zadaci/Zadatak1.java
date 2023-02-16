package Zadaci;

public class Zadatak1 {
    /*1.Napraviti program gde cete uneti informacije o nekom vocu tako sto cete kreirati String za naziv
    nekog voca i double vrednost za njegovu cenu. Uneti 4 naziva i 4 cene za odredjeno voce,
    i u svakom redu posebno stampati naziv vocke i njenu cenu za 30% snizenu.*/

    public static void main(String[] args) {

        String banana;
        String jabuka;
        String pomorandza;
        String nektarina;

        double cenaB = 200;
        double popustB = 200*0.3;
        double cenaBSnizena = cenaB - popustB;
        double cenaJ = 100;
        double popustJ = 100*0.3;
        double cenaJSnizena = cenaJ - popustJ;
        double cenaP = 150;
        double popustP = 150*0.3;
        double cenaPSnizena = cenaP - popustP;
        double cenaN = 180;
        double popustN = 180*0.3;
        double cenaNSnizena = cenaN - popustN;

        System.out.println("Cena banana sa 30% popusta je " + cenaBSnizena);
        System.out.println("Cena jabuka sa 30% popusta je " + cenaJSnizena);
        System.out.println("Cena pomorandzi sa 30% popusta je " + cenaPSnizena);
        System.out.println("Cena nektarina sa 30% popusta je " + cenaNSnizena);


    }


    public static class Dom1_2 {
        /*2.Napraviti program gde cete uneti svoju godinu rodjenja, trenutnu godinu
        i u konzoli istampati svoj broj godina.*/

        public static void main(String[] args) {

            int godinaRodjenja;
            int tekucaGodina;
            godinaRodjenja = 1988;
            tekucaGodina = 2022;
            int brojGodina = tekucaGodina - godinaRodjenja;
            System.out.println("Broj godina: " + brojGodina);
        }

    }
}
