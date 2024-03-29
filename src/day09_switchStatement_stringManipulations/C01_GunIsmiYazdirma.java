package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C01_GunIsmiYazdirma {

    public static void main(String[] args) {


        // kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik gelen gun ismini yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen gun numarasını giriniz...");

        int gunNO = scanner.nextInt();

        if (gunNO == 1) {
            System.out.println("Pazartesi");
        } else if (gunNO == 2) {
            System.out.println("Salı");
        } else if (gunNO == 3) {
            System.out.println("Çarşamba");
        } else if (gunNO == 4) {
            System.out.println("Perşembe");
        } else if (gunNO == 5) {
            System.out.println("Cuma");
        } else if (gunNO == 6) {
            System.out.println("Cumartesi");
        } else if (gunNO == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Lutfen gecerli bır gun numarası giriniz...");
        }

        switch (gunNO) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
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
            System.out.println("Lutfen gecerli bır gun numarası giriniz...");
        }
    }
}
