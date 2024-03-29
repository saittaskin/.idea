package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Day19_C03DersTekrarı {

    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        //         bize donduren bir method olusturun.
        //         Eski array’i yeni haliyle kaydedin.

        int[] arr = {3,5,6,4,2};

        arr= elemanDegeriniArtirma(arr,2);

        System.out.println("Verilen arr nin 2 artirilmis hali : " + Arrays.toString(arr));
    }

    public static int[] elemanDegeriniArtirma (int[] arr , int artisMiktari) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + artisMiktari;
        }

        return arr;
    }


















}
