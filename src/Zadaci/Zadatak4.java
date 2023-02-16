package Zadaci;

import java.util.Scanner;

public class Zadatak4 {
    /*1. Napisati program gde cete uneti velicinu majice: 24 (Ispise: S velicina), 30cm (Ispise: M Velicina),
      36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu majice (24/30/36/42): ");
        int x = sc.nextInt();

        switch (x) {

            case 24:
                System.out.println("S Veličina");
                break;

            case 30:
                System.out.println("M Veličina");
                break;
            case 36:
                System.out.println("L Veličina");
                break;

            case 42:
                System.out.println("XL Veličina");
                break;


            default:
                System.out.println("Greška: uneli ste nepostojeću veličinu");
                break;
        }

    }
}
