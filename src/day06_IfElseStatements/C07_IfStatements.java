package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfStatements {

    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // kullanici 0 ile 100 arasinda olmayan bir not girerse
        // gecersiz not yazdirin
        // 0 ile 100 arasinda (sinirlar dahil) bir not girerse
        // gecerli not yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if (not >=0 && not <=100){
            System.out.println("Geçerli not");
        }

        if (not<0 || not>=100) {
            System.out.println("Geçersiz not");
        }
    }
}
