package day08_ternary_switchStatements;

import java.util.Scanner;

public class Day08_C05DersTekrarı {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan notunu alin
        //       50 veya daha buyukse ”Sinifi Gectin”,
        //       50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if (not > 100 || not < 0) {
            System.out.println("Gecersiz not girdiniz");
        } else if (not >= 50) {
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef kaldın");
        }

        System.out.println("====================================================================");


        System.out.println(not < 0 || not > 100 ? "lutfen gecerli bir not girinzi" : not >=50 ? "Sınıfı gectin" : "Maalef kaldın");
    }
}
