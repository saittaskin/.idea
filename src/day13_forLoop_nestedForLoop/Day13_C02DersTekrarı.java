package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class Day13_C02DersTekrarı {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan 14’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	      Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = sayi; i >= 1 ; i--) {

            faktoriyel *=i;
        }

        System.out.println(faktoriyel + " ");
    }
}
