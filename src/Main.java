import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 22 % 3;
        System.out.println(wiek); // 2
        if (wiek == 0) {
            System.out.println("podzielny przez 3");
        } else {
            System.out.println("niepodzielny przez 3");
        }




        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int numer_albumu = 57081;
        int parzystosc = (numer_albumu % 2 == 0) ? 0 : 1;
        System.out.println("Parzystość: " +parzystosc);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj losową liczbę");
        double first = scanner.nextDouble();
        System.out.println("Podaj drugą losową liczbę");
        double second = scanner.nextDouble();
        double suma = first + second;

        System.out.println("Wynik dodania tych liczb to" +suma);

    }
}