package day11_stringManipulations;

import java.util.Scanner;

public class Day11_C02DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve aradigi metin parcasini isteyin
        // cumle ve metnin durumuna gore, asagidaki durumlardan uygun olani yazdirin
        // 1- aradiginiz metin cumlede yok
        // 2- aradiginiz metin cumlede sadece 1 kere kullanilmis
        // 3- aradiginiz metin cumlede 1'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

      int ilkIndex = cumle.indexOf(metin);
      int lastIndex = cumle.lastIndexOf(metin);

      if (ilkIndex == -1) {

          System.out.println("aradiginiz metin cumlede yok");

      } else if (ilkIndex == lastIndex) {

          System.out.println("aradiginiz metin cumlede sadece 1 kere kullanilmis");

      } else {

          System.out.println("aradiginiz metin cumlede 1'den fazla kullanilmis");

      }
    }
}
