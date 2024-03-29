package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class Day16_C04DersTekrarı {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int sayiToplami = 0;
        int sayiAdedi = 0;

        do {
            System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz..." +
                    "\nBitirmek icin 0'a basin");

            sayi = scanner.nextInt();

            if (sayi < 0) {

                System.out.println("Negatif sayi kullanamazsınız...");
            } else if (sayi > 0) {

                sayiToplami += sayi;
                sayiAdedi++;
            }
        }

        while (sayi != 0);

            System.out.println("Girilen sayi" + sayiAdedi + " adet pozitif sayinin toplami : " + sayiToplami);
    }
}
