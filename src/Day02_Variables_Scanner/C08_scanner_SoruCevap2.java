package Day02_Variables_Scanner;

import java.util.Scanner;

public class C08_scanner_SoruCevap2 {

    public static void main(String[] args) {

        // - Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bır double sayı giriniz...");

        double doubleSayı = scanner.nextDouble();

        System.out.println("Lutfen bır ınt sayı giriniz...");

        int intSayı = scanner.nextInt();

        System.out.println("girdiginiz int sayı ve double sayılarının toplamı : " + (doubleSayı + intSayı));

        System.out.println("girdiginiz int sayı ve double sayılarının carpımı : " + (doubleSayı * intSayı));

    }
}
