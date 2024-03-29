package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_Soru {

    public static void main(String[] args) {

       // Ogrencinin notu 85 ve ustu ise AA,
       // (85 ve ustu degilse) 65 ve ustu ise BB,
       // (65 ve ustu de degilse) 50 ve ustu ise CC,
       // (geriye kalanlar) DD

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not1 = scanner.nextDouble();

        if (not1>=85) {
            System.out.println("AA");
        } else if (not1<85 && not1>=65) {
            System.out.println("BB");
        } else if (not1<65 && not1>=50) {
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }
    }
}
