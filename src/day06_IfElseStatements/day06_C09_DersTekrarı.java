package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C09_DersTekrarı {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        //        65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        //        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasiniz giriniz...");
        double yas = scanner.nextDouble();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else if (yas < 65) {
            System.out.println("Emekli olmanız icin  " + (65 - yas) + " " + "yil daha calismalisiniz");
        }
    }
}
