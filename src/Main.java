import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int zmienna1;
        zmienna1= 10;
        int zmienna2 = 30;
        int a=10;
        int b=5;
        int c=6;
        short a1 = 10;
        byte b1 = 8;
        long c1 = 50L;
        float d1 = 1.2F;


        int wynik = a + b + c;
        System.out.println("Nasze liczby:" + a + " ," + a1 +" ," + b1 +" ," + c1 +" ," + d1 +"\n");

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        int odejmowanie= a-b;
        double x=3.03;
        double y=4.03;
        double odejmowanie1= x-y;

        System.out.println("Operacje na liczbach a i b");
        System.out.println("Wynik dodawania to" + " " + a+b);
        System.out.println("Wynik odejmowania to" + " " + odejmowanie);
        System.out.println("Wynik mnożenia to" + " " + a*b);
        System.out.println("Wynik dzielenia to" + " "+ a/b);
        System.out.println("Wynik modulo to" + " " + a%b + "\n");

        System.out.println("Operacje na liczbach x i y");
        System.out.println("Wynik dodawania to" + " " + x+y);
        System.out.println("Wynik odejmowania to" + " " + odejmowanie1);
        System.out.println("Wynik mnożenia to" + " " + x*y);
        System.out.println("Wynik dzielenia to" + " "+ x/y);
        System.out.println("Wynik modulo to" + " " + x%y);





    }
}