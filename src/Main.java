import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tablica = new double[5];
        tablica[0] = 20;
        tablica[1] = 5;
        tablica[2] = 12.65;
        tablica[3] = 15.60;
        tablica[4] = 18.18;
        for(int i=0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}