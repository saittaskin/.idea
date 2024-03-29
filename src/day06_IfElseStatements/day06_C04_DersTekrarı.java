package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C04_DersTekrarı {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");

        System.out.print("Kenar1 :");
        double kenar1 = scanner.nextDouble();

        System.out.print("Kenar2 :");
        double kenar2 = scanner.nextDouble();

        System.out.print("Kenar3 :");
        double kenar3 = scanner.nextDouble();

        System.out.println("");

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgen");
        }



















    }
}
