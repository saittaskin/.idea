package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class Day14_C03DersTekrarı {

    public static void main(String[] args) {

        // verilen bir metni tersten yazdiran bir method olusturun

        metniTerstenYazdırma("java guzeldir");

        metniTerstenYazdırma("Java kolay");

    }

    public static void metniTerstenYazdırma(String metin){

        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }
        System.out.println("");
    }
}
