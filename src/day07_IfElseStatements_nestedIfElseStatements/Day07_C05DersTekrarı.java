package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C05DersTekrarı {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz 'E' : Erkek , 'K' : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lurtfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz yas");
        } else if (cinsiyet == 'K' && yas > 60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak icin " + (60 - yas) + "yil daha calismalisin");
        } else if (cinsiyet == 'E' && yas > 65) {
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak icin " + (65 - yas) + "yil daha calismalisin");
        } else {
            System.out.println("Girilen bilgiler yanlis, lutfen tekrar deneyin");
        }
    }
}
