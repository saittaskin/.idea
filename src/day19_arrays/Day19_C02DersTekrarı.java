package day19_arrays;

import java.util.Arrays;

public class Day19_C02DersTekrarı {

    public static void main(String[] args) {

        // Verilen bir int array'deki tum elementleri toplayip yazdiran bir method olusturun

        int[] arr = {3,4,5,6};

        elementlerinToplami(arr);

        int[] yeniSayi = {3,4,5,6,8};

        arr = yeniSayi;

        elementlerinToplami(arr);
    }

    public static void elementlerinToplami (int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }

        System.out.println("Verilen elementlerin toplamı : " + toplam);
    }
}
