package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C04DersTekrarı {

    public static void main(String[] args) {

        //   Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        //        ve cevirmek istedigi birimi sorun,
        //        istedigi birim metre veya santimetre ise cevirip yazdirin,
        //        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Km olarak mesafeyi giriniz...");
        double mesafe = scanner.nextDouble();

        System.out.println("Lytfen cevirmek istediginiz birimiz giriniz...");

        String girilenMesafe = scanner.next();

        if (girilenMesafe.equalsIgnoreCase("metre")) {
            System.out.println("Girilen mesafe metre olarak : " + mesafe*1000 + " metredir");
        } else if (girilenMesafe.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafe santimetre olarak : " + mesafe*1000000 + " metredir");
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }


    }
}
