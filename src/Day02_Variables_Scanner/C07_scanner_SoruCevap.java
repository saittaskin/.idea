package Day02_Variables_Scanner;

import java.util.Scanner;

public class C07_scanner_SoruCevap {

    public static void main(String[] args) {

        //Kullanicidan uc farkli data turunde deger alip
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bır tamsayı gırınız...");

        int değer1 = scanner.nextInt();

        System.out.println("girdıgınız deger bır tam sayıdır :" + değer1);

        System.out.println("Lutfen bır metın gırınız...");

        String deger2 = scanner.next();

        System.out.println("girdıgınız deger bir metindir : " + deger2.toLowerCase());

        System.out.println("Lutfen bır double sayı giriniz");

        double deger3 = scanner.nextDouble();

        System.out.println("girdiginiz deger bır double sayıdır : " + deger3);


    }
}
