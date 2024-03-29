package Day03_scanner_dataCasting;

import java.util.Scanner;

public class Day03_C01gurup {

    public static void main(String[] args) {

        // - Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Luutfen soyadinziz giriniz...");
        String soyad = scanner.nextLine();

        System.out.println("Lutfen yasınzı giriniz...");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim +
                           " " + "\nSoyisminiz : " + soyad +
                           " " + "\nYasinzi : " + yas +
                           "\nKaydiniz basariyla tamamlanmistir.");

        // System.out.println("Kaydiniz basariyla tamamlanmistir.");














    }
}
