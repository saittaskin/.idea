package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C02_gurup {
    public static void main(String[] args) {

        // Kullanicidan ismini alip
        // ismi buyuk harf olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println(isim.toUpperCase());
    }
}
