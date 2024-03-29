package day08_ternary_switchStatements;

import java.util.Scanner;

public class Day08_C06DersTekrarı {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz...");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz...");
        double sayi2 = scanner.nextDouble();

        if (sayi1 > sayi2) {
            System.out.println(sayi2);
        } else {
            System.out.println(sayi1);
        }

        System.out.println("=============================");

        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
