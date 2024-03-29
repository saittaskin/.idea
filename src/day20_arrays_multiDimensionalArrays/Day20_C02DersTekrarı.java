package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class Day20_C02DersTekrarı {

    public static void main(String[] args) {

        // verilen int bir array'e istenen elemani ekleyip
        // array'in son halini donduren bir method olusturun

        int[] sayilar = {3,5,7};
        int eklenecekSayi = 9;

        sayilar = arrayaElemanEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar));

        sayilar = arrayaElemanEkle(sayilar,1);

        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayaElemanEkle(int[] arr , int eklenecekSayi) {

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        return yeniArr;
    }
}
