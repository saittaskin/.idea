package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class Day04_C06gurup {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi isteyip
        // sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int girilenSayi = scanner.nextInt(); // 156

        int sayi = girilenSayi; // 145

        int birlerBasamagi = 0;
        int rakamlarToplamı = 0;

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi;
        sayi /= 10; // 14

        birlerBasamagi = sayi % 10; // 4
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi;
        sayi /= 10; // 1

        rakamlarToplamı = rakamlarToplamı + sayi;

        System.out.println("Girmiş oldugunuz sayının rakamlar toplamı : " + rakamlarToplamı);













    }
}
