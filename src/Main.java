import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */


        //zad1

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Imię: ");
        String imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int nr_indeksu = scan.nextInt();

        System.out.println(" Imię:" + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek + " Nr indeksu: " + nr_indeksu +"");
        System.out.printf("Imię: %s Nazwisko: %s Wiek: %d Nr indeksu %d \n", imie, nazwisko, wiek, nr_indeksu);



        //zad2
        int zmienna1 = 10;
        int zmienna2 = 5;

        int dodawanie = zmienna1 + zmienna2;
        int odejmowanie = zmienna1 - zmienna2;
        int mnozenie = zmienna1 * zmienna2;
        int dzielenie = zmienna1 / zmienna2;
        int modulo = zmienna1 % zmienna2;

        System.out.println("\n wynik dodawania: " + dodawanie+ "\n wynik odejmowania: " + odejmowanie + "\n wynik mnożenia: " + mnozenie + "\n wynik dzielenia: " + dzielenie + "\n wynik modulo: " + modulo);



    }
}