package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class Day04_C02_DersTekrarı {

    public static void main(String[] args) {

        //Soru 1- Int olarak verilen 3 degerin ortalamasini
        //        double olarak yazdiran bir kod yazin

        int sayi1 = 20;
        int sayi2 = 40;
        int sayi3 = 50;

        int sayilarinToplami = sayi1 + sayi2 + sayi3;


        System.out.println("Verilen degerlerin ortalamasi : " + (double)(sayilarinToplami)/3);

        System.out.println("==================================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc tam sayı giriniz...");

        int deger1 = scanner.nextInt();
        int deger2 = scanner.nextInt();
        int deger3 = scanner.nextInt();

        System.out.println("Girdiginiz degerlerin ortalamasi : " + (double)(deger1 + deger2 + deger3)/3);
    }
}
