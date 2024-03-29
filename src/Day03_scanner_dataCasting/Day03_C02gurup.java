package Day03_scanner_dataCasting;

import java.util.Scanner;

public class Day03_C02gurup {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1. sayiyi giriniz...");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2. sayiyi giriniz...");

        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi1; // 20

        sayi1 = sayi2; // 50

        sayi2 = temp; // 20

        System.out.println("sayi1 : " + sayi1 + "\nsayi2 : " + sayi2 + "\noldu");























    }
}
