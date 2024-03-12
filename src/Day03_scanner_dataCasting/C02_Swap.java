package Day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1. sayıyı giriniz...");

        int sayı1 = scanner.nextInt();

        System.out.println("Lutfen 2. sayıyı giriniz...");

        int sayı2 = scanner.nextInt();

        int temp = 0;

        temp = sayı1;

        sayı1 = sayı2;

        sayı2 = temp;

        System.out.println("sayıların yerını değiştirdim " + "\nsayı1 : " + sayı1 + ", \nsayı2 : " + sayı2 + "\noldu" );
    }
}
