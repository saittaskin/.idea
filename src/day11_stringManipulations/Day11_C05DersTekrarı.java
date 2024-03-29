package day11_stringManipulations;

import java.util.Scanner;

public class Day11_C05DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // ve metinde varsa ilk rakam'i * yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        System.out.println(metin.replaceFirst("\\d","*"));
    }
}
