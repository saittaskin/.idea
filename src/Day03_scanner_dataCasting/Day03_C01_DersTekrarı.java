package Day03_scanner_dataCasting;

import java.util.Scanner;

public class Day03_C01_DersTekrarı {

    public static void main(String[] args) {

        // - Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz...");
        String soyad = scanner.nextLine();

        System.out.println("Lutfen yasınızı giriniz...");
        double yas = scanner.nextDouble();

        System.out.println("Isminiz : " + isim +
                           "\nSoyisminiz : " + soyad +
                           "\nYasiniz : " + yas +
                           "\nKaydiniz basariyla tamamlanmistir.");


    }
}
