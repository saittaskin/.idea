package day08_ternary_switchStatements;

import java.util.Scanner;

public class Day08_C04DersTekrarı {

    public static void main(String[] args) {


        // verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        // - sayi negatif
        // - 0 pozitif veya negatif degildir

        int sayi = 0;

        if (sayi > 0 ) {
            System.out.println("Sayı pozıtıf");
        } else if (sayi < 0 ) {
            System.out.println("Sayi negatif");
        } else {
            System.out.println("0 pozitif veya negatif degildir");
        }

        System.out.println(sayi > 0 ? "sayı pozifit" : "Sayi 0 veya negatif olabilir");

        System.out.println( sayi>0 ? "Sayi pozitif" : sayi == 0 ? "0 pozitif veya negatif degildir" : "Sayi negatif" );
    }
}
