package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class Day12_C05DersTekrarı {

    public static void main(String[] args) {

        // iki basamakli pozitif tamsayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 10; i < 100; i++) {

            toplam += i;

        }
        System.out.println("İki basamakli sayilarin toplami : " + toplam);

        System.out.println("");

        // 10 ile 50 arasindaki(sinirlar dahil) 9 ile bolunebilen sayilari toplayin

         toplam = 0;

        for (int i = 10; i <= 50 ; i++) {

            if (i % 9 == 0) {
                toplam +=i;
            }
        }
        System.out.println("10 ile 50 arasında 9 ile bölüne bilen sayilarin toplami : " + toplam);

        System.out.println("");

        // 2 basamakli pozitif ve negatif tum sayilarin toplamini yazdirin

        toplam = 0;

        for (int i = 99; i <=99 ; i++) {

            if (i >= -9 && i< 10) {
                toplam += i;
            }
        }

        System.out.println("2 basamakli pozitif ve negatif tum sayilarin toplami : " + toplam);









    }
}
