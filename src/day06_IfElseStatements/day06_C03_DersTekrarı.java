package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C03_DersTekrarı {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int girlenSayi = scanner.nextInt();

        if (girlenSayi % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (girlenSayi % 5 == 0) {
            System.out.println("Bes ile bolunebilen sayi");
        }




















    }
}
