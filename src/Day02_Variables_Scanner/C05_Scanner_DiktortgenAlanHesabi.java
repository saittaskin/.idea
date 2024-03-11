package Day02_Variables_Scanner;

import java.util.Scanner;

public class C05_Scanner_DiktortgenAlanHesabi {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dıkdortgenın kenar uzunluklarını giriniz...");

        double uzunKenar = scanner.nextDouble();

        System.out.println("Girilen uzun kenar : " + uzunKenar);

        double kısaKenar = scanner.nextDouble();

        System.out.println("Girilen kısa kenar : " + kısaKenar);


        System.out.println("Karenın Alanı : " + kısaKenar*uzunKenar);
    }
}
