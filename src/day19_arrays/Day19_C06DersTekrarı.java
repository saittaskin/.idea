package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Day19_C06DersTekrarı {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        //         ve bize donduren bir method olusturun.

        // System.out.println(Arrays.toString(arrayOlustur()));

        int[] kullnıcıArr = arrayOlustur();
    }


    public static int[] arrayOlustur() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen arrayin kac elemanlı olacagini giriniz...");

        int lengt = scanner.nextInt();

        int[] arr = new int[lengt];

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + ". index'deki eleman icin bir deger giriniz...");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
