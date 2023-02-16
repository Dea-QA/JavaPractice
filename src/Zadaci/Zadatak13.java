package Zadaci;

import java.util.Scanner;

public class Zadatak13 {
    //3. Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj,
    // i u novom nizu smestiti sve brojeve iz prethodnog niza koji su veci od tog unetog broja
    // (obratiti paznju da nov niz nema prazna polja, tj. 0).

        public static void main(String []  arg) {

            int[] niz = {1,2,3,4,5,6,7,8};

            Scanner sc = new Scanner(System.in);

            System.out.println("Unesite broj: ");
            int broj = sc.nextInt();

            int[] noviNiz = new int[niz.length];

            for(int i=0; i<niz.length; i++) {
                if(broj<niz[i]) {
                    noviNiz[i] = niz[i];
                } else {
                    continue;
                }
                System.out.println(noviNiz[i]);
            }
        }

    }
