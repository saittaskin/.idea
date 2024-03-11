package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C05_DersTekrarı {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diktorgenin Kenar uzunluklarını giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Diktörtgenin alanı : " + (int)(kenar1 * kenar2)); // Diktörtgenin alanı : 30
    }
}
