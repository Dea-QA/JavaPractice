package Zadaci;

public class Zadatak11 {

    //1. Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
    // na kraju treba ispisati najveci broj od onih koje smo uneli.

    public static void main(String[] args) {

        int [] niz = new int[5];

        niz[0] = 9;
        niz[1] = 2;
        niz[2] = 17;
        niz[3] = 4;
        niz[4] = 5;

      int max = 0;

      for (int i = 0; i < niz.length; i++) {
          if(niz[i] > max) {
              max = niz[i];
          }
      }
        System.out.println(max);
    }
}
