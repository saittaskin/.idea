package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class Day04_C06_DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi isteyip
        // sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen üç basamaklı bır sayı giriniz...");
        int girilenSayı = scanner.nextInt();

        int sayi = girilenSayı; // 156
        int birlerBasamagi = 0;
        int rakamlarToplamı = 0;

        birlerBasamagi = sayi % 10;
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi;
        sayi /=10;

        birlerBasamagi = sayi % 10;
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi;
        sayi /=10;

        rakamlarToplamı = rakamlarToplamı + sayi;

        System.out.println("Girilen " + girilenSayı + " sayısının rakamlar toplamı : " + rakamlarToplamı);

    }
}
