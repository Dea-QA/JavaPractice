package Zadaci;

import java.util.Scanner;

public class Zadatak8WhileLoop {

    //1. Napraviti program gde cete uneti neki broj i kao rezultat vratiti
    // zbir svih njegovih prethodnih brojeva (sa while petljom).

    public static void main(String[] args) {

        System.out.println("Unesite neki broj: ");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();

        int zbirPrethodnihBrojeva = 0;
        int i = 0;
       while (i < broj) {
           zbirPrethodnihBrojeva = zbirPrethodnihBrojeva + i;
           i++;
        }
        System.out.println("Zbir prethodnih brojeva unetog broja je: " + zbirPrethodnihBrojeva);
    }
}


