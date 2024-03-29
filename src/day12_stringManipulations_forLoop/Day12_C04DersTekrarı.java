package day12_stringManipulations_forLoop;

public class Day12_C04DersTekrarı {

    public static void main(String[] args) {

        // 1'den 100'e kadar(dahil) olan sayilari yazdirin

        for (int i = 0; i <= 100 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println("");

        // 34'den baslayip 3'er 3'er artirarak
        // 100'e kadar(100 haric) sayilari yazdirin

        for (int i = 34; i < 100 ; i +=3 ) {

            System.out.print(i + " ");
        }
        System.out.println("");


        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        for (int i = 10; i < 100; i++) {

           if (i / 7 == 0) {
               System.out.print(i + " ");
           }
        }
    }
}
