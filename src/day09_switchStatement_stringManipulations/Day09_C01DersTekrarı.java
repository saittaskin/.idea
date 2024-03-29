package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class Day09_C01DersTekrarı {

    public static void main(String[] args) {

        // kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik gelen gun ismini yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasını giriniz...");
        int gunNo = scanner.nextInt();

        if (gunNo == 1) {
            System.out.println("Pazartesi");
        } else if (gunNo == 2) {
            System.out.println("Salı");
        } else if (gunNo == 3) {
            System.out.println("Çarşamba");
        } else if (gunNo == 4) {
            System.out.println("Persembe");
        } else if (gunNo == 5) {
            System.out.println("Cuma");
        } else if (gunNo == 6) {
            System.out.println("Cumartesi");
        } else if (gunNo == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Lutfen gecerli bir gün numarası girirniz...");
        }

        switch (gunNo) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun numarası giriniz");
        }
    }
}
