package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C07_DersTekrarı {

    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // kullanici 0 ile 100 arasinda olmayan bir not girerse
        // gecersiz not yazdirin
        // 0 ile 100 arasinda (sinirlar dahil) bir not girerse
        // gecerli not yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz...");

        double not = scanner.nextDouble();

        if (not >= 0 && not <= 100) {

            System.out.println("Gecerli not");
        }

        if (not < 0 || not > 100) {

            System.out.println("Gecersiz not");
        }
    }
}
