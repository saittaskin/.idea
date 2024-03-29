package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C01DersTekrarı {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Luten kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz...");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy *boy));

        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (vke > 30) {
            System.out.println("Obezsiniz");
        } else if (vke > 25) {
            System.out.println("Kilolusunuz");
        } else if (vke > 20) {
            System.out.println("Normal kilodasınız");
        } else if (vke < 20 ) {
            System.out.println("Zayıfsınız");
        }
    }
}
