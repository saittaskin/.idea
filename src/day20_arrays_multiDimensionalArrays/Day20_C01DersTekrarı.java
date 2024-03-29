package day20_arrays_multiDimensionalArrays;

public class Day20_C01DersTekrarı {

    public static void main(String[] args) {

        // verilen int bir array'de
        // verilen min ve max degerler dahil olarak
        // min ve max degerler arasindaki sayilari yazdiran bir method olusturun

        int[] sayilar = {23,45,12,78,54,1,98};

        aradakiElamanlar(sayilar,10,100);
        aradakiElamanlar(sayilar,15,66); // 23 45 54
        aradakiElamanlar(sayilar,100,500); // bos satir

    }


    public static void aradakiElamanlar (int[] arr , int minDeger , int maxDeger) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= minDeger && arr[i] <= maxDeger){

                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("");
    }
}
