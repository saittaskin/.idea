package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {

    public static void main(String[] args) {

        /*
            Verilen gorev sonucunda yazdigimiz kod
            else(geriye kalanlar) ile bitmeyebilir

            EGER
            if, else-if,.... cumleleri else ile bitmiyorsa
            bazi degerler icin hic bir if body'sinin calismayacagini
            gozonunde bulundurmaliyiz
         */

        // kullanicdan bir tamsayi alin
        // sayi 0'dan kucukse "negatif sayi" yazdirin
        // negatif olmayan sayilardan
        // tek basamakli olanlar icin "Rakam",
        // iki basamakli sayilar icin "Sayi",
        // uc basamakli sayilar icin "Buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bır tamsayı giriniz...");

        int sayı = scanner.nextInt();

        if (sayı<0) {
            System.out.println("Negatif sayı");
        } else if (sayı>=0 && sayı<10) {
            System.out.println("Rakam");
        } else if (sayı>=10 && sayı<100) {
            System.out.println("Sayı");
        } else if (sayı>=100 && sayı<1000) {
            System.out.println("Büyük sayı");
        }
    }
}
