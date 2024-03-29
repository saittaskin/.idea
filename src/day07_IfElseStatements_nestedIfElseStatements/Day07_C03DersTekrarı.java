package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C03DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyin
        // sayi 7 ile bolunuyorsa "7'nin kati",
        // sayi 5 ile bolunuyorsa "5'in kati"
        // her ikisine de bolunuyorsa "Super sayi"
        // ikisine de bolunemiyorsa "Kotu sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 7 == 0 && sayi % 5 == 0) {
            System.out.println("Super sayi");
        } else if (sayi % 7 == 0) {
            System.out.println("7'nin kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        } else {
            System.out.println("Kotu sayi");
        }
    }
}
