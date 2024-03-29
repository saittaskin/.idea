package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class Day16_C03DersTekrarı {

    public static void main(String[] args) {

        // Soru 2- While loop kullanarak
        //         kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamları toplancak sayıyı giriniz...");
        int sayi = scanner.nextInt();

        int enSondakiRakam = 0;
        int rakamlarToplamı = 0;
        int verilenSayi = sayi;

        while (verilenSayi > 0 ) {

            enSondakiRakam = verilenSayi % 10;
            rakamlarToplamı += enSondakiRakam;
            verilenSayi /= 10;
        }

        System.out.println("Verilen "+sayi + " sayisinin rakamlar toplami : " + rakamlarToplamı);
    }
}
