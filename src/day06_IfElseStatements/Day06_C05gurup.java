package day06_IfElseStatements;

import java.util.Scanner;

public class Day06_C05gurup {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen gitmek istediginiz ayi giriniz...");

        char harf = scanner.nextLine().charAt(0);

        if (harf == 'o' || harf == 'O') {

            System.out.println("Ocak");
        } else if (harf == 'ş') {

            System.out.println("Şubat");
        } else if (harf == 'm' || harf == 'M') {

            System.out.println("Mart veya Mayıs");
        } else if (harf == 'n' || harf == 'N') {

            System.out.println("Nisan");
        } else if (harf == 'h' || harf == 'H') {

            System.out.println("Haziran");
        } else if (harf == 't' || harf == 'T') {

            System.out.println("Temmuz");
        } else if (harf == 'a' || harf == 'A') {

            System.out.println("Ağustos veya Aralık");
        } else if (harf == 'e' || harf == 'E') {

            System.out.println("Eylül veya Ekim");
        } else if (harf == 'k' || harf == 'K') {

            System.out.println("Kasım");
        } else {

            System.out.println("Lutfen geverli bir ay harfi giriniz...");
        }
    }
}
