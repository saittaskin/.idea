package day06_IfElseStatements;

import java.util.Scanner;

public class Day06_C04gurup {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1. kenar uzunlugunu giriniz...");
        int kenar1 = scanner.nextInt();

        System.out.println("Lutfen 2. kenar uzunlugunu giriniz...");
        int kenar2 = scanner.nextInt();

        System.out.println("Lutfen 3. kenar uzunlugunu giriniz...");
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 >0) {

            System.out.println("Eskenar ucgen");
        } else {

            System.out.println("Eskenar ucgen degil");
        }
    }
}
