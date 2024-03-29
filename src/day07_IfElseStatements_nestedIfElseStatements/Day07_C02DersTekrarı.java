package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C02DersTekrarı {

    public static void main(String[] args) {

        // kullanicdan bir tamsayi alin
        // sayi 0'dan kucukse "negatif sayi" yazdirin
        // negatif olmayan sayilardan
        // tek basamakli olanlar icin "Rakam",
        // iki basamakli sayilar icin "Sayi",
        // uc basamakli sayilar icin "Buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır tam sayı giriniz...");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("negatif sayi");
        } else if (sayi < 10 && sayi >=0) {
            System.out.println("Rakam");
        } else if (sayi >= 10 && sayi < 100) {
            System.out.println("Sayi");
        } else if (sayi >= 100 && sayi < 1000) {
            System.out.println("Buyuk sayi");
        }
    }
}
