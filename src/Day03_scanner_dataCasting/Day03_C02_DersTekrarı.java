package Day03_scanner_dataCasting;

import java.util.Scanner;

public class Day03_C02_DersTekrarı {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz...");
        int sayi1 = scanner.nextInt();
        System.out.println("Sayi1'in değer : " + sayi1);

        System.out.println("Lutfen ikinci bir tamsayi daha giriniz...");
        int sayi2 = scanner.nextInt();
        System.out.println("Sayi2'nin degeri : " + sayi2);

        int temp = '0';

        temp = sayi1;

        sayi1 = sayi2;

        sayi2 = temp;

        System.out.println("");

        System.out.println("Alinan iki sayinin yerlerinin degistirilmis hali : " + "\nsayi1 : " + sayi1 + "\nsayi2 : " + sayi2);

    }
}
