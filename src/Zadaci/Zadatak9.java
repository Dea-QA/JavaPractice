package Zadaci;

import java.util.Scanner;

public class Zadatak9 {

    //2. Napraviti program gde cete uneti broj nekih knjiga na lageru,
    // Zatim, svaki put kada unesete ".", on ce skinuti po jednu knjigu sa lagera.
    // Tek nakon sto unesete neki drugi String ili nema vise knjiga na lageru,
    // izaci ce iz petlje i ispisati poruku. Ukoliko vise nema knjiga na lageru,
    // ispisace poruku da nema vise knjiga na lageru, a ukoliko je unet neki drugi String,
    // ispisace samo stanje knjiga na lageru.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj knjiga na lageru: ");
        int brojKnjiga = scanner.nextInt();
        String string;

            while (brojKnjiga > 0) {

                System.out.println("Trenutno knjiga na lageru: " + brojKnjiga);
                System.out.println("Unesite tacku za svaku prodatu knjigu. ");
                string = scanner.next();

                if (string.equals(".")) {
                    brojKnjiga = brojKnjiga - 1;
                    if (brojKnjiga == 0) {
                    System.out.println("Na lageru vise nema knjiga.");
                }
                } else {
                    System.out.println("Neispravan unos. Na lageru je trenutno " + brojKnjiga + " knjiga.");
                    break;

                }
            }
        }
    }

