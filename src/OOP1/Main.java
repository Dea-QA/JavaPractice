package OOP1;

public class Main {
    //Napraviti klasu Knjiga koja ce imati naziv i zanr. U glavnoj klasi napraviti dve knjige,
    // zatim proveriti da li imaju isti zanr i naziv. Ako imaju, ispisati poruku da je
    // u pitanju ista knjiga. Ako je samo zanr isti, ispisati poruku koji je to zanr.
    // Ako nista od toga nije isto, ispisati poruku da su u pitanju dve razlicite knjige.

    public static void main(String[] args) {

        Knjiga knjiga1 = new Knjiga();
        knjiga1.naziv = "Igra prestola";
        knjiga1.zanr = "epska fantastika";


        Knjiga knjiga2 = new Knjiga();
        knjiga2.naziv = "Sumrak idola";
        knjiga2.zanr = "filozofija";


        if( (knjiga1.naziv.equals(knjiga2.naziv)) && (knjiga1.zanr.equals(knjiga2.zanr))) {
            System.out.println("Ista knjiga");
        } else if ((!knjiga1.naziv.equals(knjiga2.naziv)) && (knjiga1.zanr.equals(knjiga2.zanr))) {
            System.out.println("Knjige su istog zanra - " + knjiga1.zanr);
        } else {
            System.out.println("Knjige su razlicite");
        }
    }
}
