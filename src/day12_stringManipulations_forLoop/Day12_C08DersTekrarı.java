package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class Day12_C08DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar dahil olarak
        // aralarindaki 9 ile bolunebilen sayilari yazdirin
        // bitis degeri baslangictan kucuk olsa da kod calismalidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

       if (baslangic < bitis) {

           for (int i = baslangic; i < bitis ; i++) {

               if (i % 9 == 0) {
                   System.out.print(i + " ");
               }
           }
       } else {
           if (bitis < baslangic)

               for (int i = bitis; i < baslangic; i++) {

                   if (i % 9 == 0) {
                       System.out.print(i + " ");
                   }
               }
       }
    }
}
