package day10_StringManipulations;

import java.util.Scanner;

public class Day10_C06DersTekrarı {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyip
        // girilen metindeki 2.anin index'ini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int ilkIndex = metin.indexOf("a");

        System.out.println(metin.indexOf("a" , ilkIndex + 1));
    }
}
