package day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfElseStatements {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi 100'den kucuk ise "tebrikler kazandiniz" yazdirin
        // sayi 100'den kucuk degilse
        // "Maalesef bu defa olmadi" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bır sayı giriniz...");

        double girilenSayı = scanner.nextDouble();

        if (girilenSayı<100) {

            System.out.println("Tebrikler kazandınız");
        } else {
            System.out.println("Malesef bu defa olmadı");
        }
    }
}
