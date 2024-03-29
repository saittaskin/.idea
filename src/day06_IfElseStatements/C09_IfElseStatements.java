package day06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        //        65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        //        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasınızı giriniz...");

        double yaş = scan.nextDouble();

        if (yaş>=65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olabilmeniz için " + (65-yaş) + " " + "yıl daha çalışmalısın");
        }
    }
}
