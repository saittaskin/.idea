package day22_ArrayList;

import java.util.Arrays;

public class day22_arar {

    public static void main(String[] args) {

        int arr[] = {3, 2, 3, 4, 4, 5,};

        int count = 0;



        for(int i=0; i<arr.length; i++) {

            if(arr[i]==3) {

                count++;

            }

        }

        System.out.println(count);
    }
}
