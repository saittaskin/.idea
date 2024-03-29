package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class Day04_C01_DersTekrarı {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin
        //         ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır harf giriniz...");
        char harf = scanner.nextLine().charAt(0);

        System.out.println("Girdiginiz karakterden bir sonraki karakter : " + (char)(harf + 1));
        System.out.println("Girdiginiz karakterden iki sonraki karakter : " + (char)(harf + 2));
        System.out.println("Girdiginiz karakterden üç sonraki karakter : " + (char)(harf + 3));

    }
}
