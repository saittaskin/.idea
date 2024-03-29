package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class Day15_C04DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tam sayilar isteyin
        // sayilarin toplami 500 veya daha fazla olursa
        // sayi istemeyi durdurup, toplami yazdirin.

        Scanner scanner = new Scanner(System.in);

        int sayi = 0;

        int toplam = 0;

        while (toplam < 500) {

            System.out.println("Lutfen tam sayilari giriniz...");

            sayi = scanner.nextInt();

            toplam +=sayi;

        }

        System.out.println("Girdiginiz sayilarin toplami : " + toplam);
    }
}
