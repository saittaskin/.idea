package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C05_gurup {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kısa kenar uzunlugunu giriniz...");

        double kenar1 = scanner.nextDouble();

        System.out.println("Lutfen uzun kenar uzunlugunu giriniz...");

        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin alanı : " + kenar1*kenar2);















    }
}
