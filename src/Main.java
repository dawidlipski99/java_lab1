import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int x = 5;
        int y = 8;
        int z = 3;
        int q = x + y + z;
        System.out.println( "Wynik działania x - y + z :" + q );
        q = x - y + z;

        System.out.println( "Wynik działania x / y * z :" + q );
        q= x / y * z;

        System.out.println( "Wynik działania x * y + z :" + q );
        q= x * y + z;

        System.out.println( "Wynik działania x % y + z :" + q );
        q = x % y + z;



        boolean a = true;
        boolean b = false;
        System.out.println("x && y = " + (a&&b));
        System.out.println("x || y = " + (a||b) );
        System.out.println("!(x && y) = " + !(a && b));
        System.out.println("((x && y) || (!x || y) : " + ((a && b) || (!a || b)));
        System.out.println("!((x || y) || (x || !y) : " + !((a && b) || (!a || b)));
        System.out.println("!((x && y) || (!x || y) : " + !((a && b) || (!a || b)));
        System.out.println("((x && y) %% (x || y) : " + ((a && b) && (a || b)));











    }
}