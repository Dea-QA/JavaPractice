package Zadaci;

import java.util.Scanner;

public class Zadatak8ForLoop {
    //1. Napraviti program gde cete uneti neki broj i kao rezultat vratiti
    // zbir svih njegovih prethodnih brojeva (sa for petljom).

    public static void main(String[] args) {

        System.out.println("Unesite neki broj: ");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();

        int zbirPrethodnihBrojeva = 0;
        for ( int i = 0; i < broj; i++) {

            zbirPrethodnihBrojeva = zbirPrethodnihBrojeva + i;

        }
        System.out.println("Zbir prethodnih brojeva unetog broja je: " + zbirPrethodnihBrojeva);

    }
}
