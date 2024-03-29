package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class C06_RakamlarToplamınıBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi isteyip
        // sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen uc basamaklı bır tam sayı gıriniz...");

        int girilenSayı = scanner.nextInt();

        int sayı = girilenSayı;
        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;

        birlerBasamağı = sayı % 10;
        rakamlarToplamı = rakamlarToplamı+birlerBasamağı;
        sayı = sayı/10;

        birlerBasamağı = sayı % 10;
        rakamlarToplamı = rakamlarToplamı+birlerBasamağı;
        sayı = sayı/10;

        rakamlarToplamı = rakamlarToplamı + sayı;

        System.out.println("Girilen " + girilenSayı + " sayısının rakamlar toplamı : " + rakamlarToplamı );
    }
}
