package Zadaci;

public class Zadatak12 {
    //2. Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

    public static void main(String[] args) {

        int [] niz = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < niz.length; i ++) {
            if (niz[i] % 2 != 0) {
                niz[i] += 2;
                // ili niz[i] = niz[i] + 2;
                System.out.println(niz[i]);
            }
        }

    }
}
