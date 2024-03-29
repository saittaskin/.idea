package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {

    public static void main(String[] args) {

         /*
            Bize verilen gorevdeki siralama farkli olsa da
            if, else-if ... cumlelerinin bir elek gibi calistigini unutmamaliyiz

            en cok kisitlama olani en basa yazmaliyiz
         */

        // Kullanicidan bir tamsayi isteyin
        // sayi 7 ile bolunuyorsa "7'nin kati",
        // sayi 5 ile bolunuyorsa "5'in kati"
        // her ikisine de bolunuyorsa "Super sayi"
        // ikisine de bolunemiyorsa "Kotu sayi" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz...");

        int girilenSayı = scanner.nextInt();

        if (girilenSayı%5==0 && girilenSayı%7==0) {
            System.out.println("Süper sayı");
        } else if (girilenSayı%7==0) {
            System.out.println("7'nin katı");
        } else if (girilenSayı%5==0) {
            System.out.println("5'in katı");
        } else {
            System.out.println("Kotu sayı");
        }
    }
}
