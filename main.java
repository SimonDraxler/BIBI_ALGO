import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        int eingabe = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein, die größer als 1 ist. ");
        eingabe = in.nextInt();
        do {
            if (eingabe <= 1) {
                System.out.println("Ihre Eingabe muss größer als 1 sein.");
                System.out.println("Eingabe einer ganzen Zahl, die größer als 1 ist: ");                eingabe = in.nextInt();
            }
        } while (eingabe <= 1);
        boolean[] teilbar = new boolean[eingabe + 1];
        for (int i = 2; i < teilbar.length; i++) {
            teilbar[i] = false;

        }
        for (int i = 2; i < teilbar.length; i++) {
            while (teilbar[i]) {
                i++;
            }
            for (int j = i; j*i < eingabe; j++) {
                teilbar[i * j] = true;
            }
            if (! teilbar[i] && i < eingabe) {
                System.out.println("Die " + i + "ist eine Primzahl. ");
            }

        }
    }
}

