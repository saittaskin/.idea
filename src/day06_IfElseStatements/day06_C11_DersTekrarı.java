package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C11_DersTekrarı {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi 100'den kucuk ise "tebrikler kazandiniz" yazdirin
        // sayi 100'den kucuk degilse
        // "Maalesef bu defa olmadi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        double girilenSayi = scanner.nextDouble();

        if (girilenSayi < 100) {
            System.out.println("tebrikler kazandiniz");
        } else {
            System.out.println("Maalesef bu defa olmadi");
        }
    }
}
