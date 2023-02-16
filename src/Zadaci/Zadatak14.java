package Zadaci;

import java.util.ArrayList;

public class Zadatak14 {
    //1. Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
    //jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista
    //zadrzati sve neparne brojeve.

    public static void main(String[] args) {

        int niz[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList listaParnihBr = new ArrayList<>();
        ArrayList listaNeparnihBr = new ArrayList<>();

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                listaParnihBr.add(niz[i]);
            } else {
                listaNeparnihBr.add(niz[i]);
            }

        }

            System.out.println(" Lista parnih brojeva je " + listaParnihBr);
            System.out.println(" Lista neparnih brojeva je " + listaNeparnihBr);

        }
    }

