package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class Day15_C05DersTekrarı {

    public static void main(String[] args) {

        // Main method icerisinde kullanicidan sifre isteyin
        // sifre, istenen sartlara uymadigi surece
        // kullanicidan yeni sifre istemeye devam edin
        // istenen sartlara uygun bir sifre girildiginde
        // "Sifreniz basariyla kaydedildi" yazdirin

        // sifre kontrolu icin bir method olusturun
        // asagidaki sartlari kontrol edin ve kullaniciye düzeltmesi gereken
        // tüm eksikleri söyleyin.
        // eğer tüm şartları sağlarsa method true , sartlar saglanmazsa false dondurecektir

        //ilk harf kucuk harf olmalı
        //son karakter rakam olmalı
        //sifre bosluk icermemeli
        //uzunlugu en az 10 karakter olmali.

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreSonuc = false;

        while (!sifreSonuc) {

            System.out.println("Lutfen sifre giriniz...");

            sifre = scanner.nextLine();

            sifreSonuc = sifreUygunmu(sifre);
        }

        System.out.println("Sifreniz basariyla kaydedildi...");
    }

    public static boolean sifreUygunmu (String sifre) {

        int flag = 20;

        //ilk harf kucuk harf olmalı
        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)) {

            System.out.println("İlk harf kucuk harf olmalı...");

            flag = 15;
        }

        //son karakter rakam olmalı
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {

            System.out.println("son karakter rakam olmalı...");

            flag = 15;
        }

        //sifre bosluk icermemeli

        if (sifre.contains(" ")) {

            System.out.println("Sifre bosluk ıcermemeli...");

            flag = 15;
        }

        //uzunlugu en az 10 karakter olmali.

        if (sifre.length() < 10) {

            System.out.println("Sifre en az 10 karakterden olusmalıdır...");
            flag = 15;

        }

        if (flag == 20) {

            return true;
        } else {

            return  false;
        }
    }

}
