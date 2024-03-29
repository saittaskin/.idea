package day19_arrays;

import java.util.Arrays;

public class Day19_C01DersTekrarı {

    public static void main(String[] args) {

        int[] arr = new int[4];

        // array'in 2.index'indeki elementi yazdirin
        // array'in 1.index'ine deger olarak 5 atayin
        // tum array'i yazdirin
        // bir array'de kac eleman oldugunu (length) yazdirin
        // array'deki tum elemanlari yanlarinda bir bosluk birakarak yazdirin

        System.out.println(arr[2]); // 0

        arr[1] = 5;

        System.out.println(arr); // [I@3feba861

        System.out.println(arr.length); // 4

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " "); // 0 5 0 0
        }




















    }
}
