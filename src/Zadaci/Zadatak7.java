package Zadaci;

import java.util.Scanner;

public class Zadatak7 {
    //2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih
    //  godina od vaseg rodjenja do tekuce godine (dovoljan kriterijum da su godine deljive sa 4)

    public static void main(String[] args) {

        System.out.println("Unesite godinu rodjenja: ");
        Scanner sc = new Scanner(System.in);
        int godinaRodjenja = sc.nextInt();

        int brojac = 0;
        for (int i = 2023; i >= godinaRodjenja; i--) {

            if (i % 4 == 0) {
                brojac = brojac +1;
                    }

                }
        System.out.println("Broj prestupnih godina od godine vašeg rodjenja je " + brojac + ".");

            }


        }





