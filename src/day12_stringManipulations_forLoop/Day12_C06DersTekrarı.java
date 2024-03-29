package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class Day12_C06DersTekrarı {

    public static void main(String[] args) {

        // bir kronometre yapin
        // kullanicidan aldiginiz pozitif sayidan
        // 1'e kadar tum sayilari yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int sayi = scanner.nextInt();

        for (int i = sayi; i >= 1 ; i--) {

            System.out.print(i + " ");
        }
    }
}
