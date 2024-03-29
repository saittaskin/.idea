package day19_arrays;

public class Day19_C04DersTekrarı {

    public static void main(String[] args) {

        // verilen bir String array'deki
        // her bir kelimeyi kontrol edip
        // array'de kac tane tek sayi uzunlugunda,
        // kac tane cift sayi uzunlugunda kelime bulundugunu yazdiran bir method olusturun

        String[] arr = {"Sait","Meltem","Semih","Ayşe"};

        verlinmetninTekCiftDurumu(arr);

    }

    public static void verlinmetninTekCiftDurumu (String[] arr) {

        int tekSayiAdet = 0;
        int ciftSayiAdet = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() % 2 == 0) {

                ciftSayiAdet++;
            } else {

                tekSayiAdet++;
            }
        }

        System.out.println("array'de " + tekSayiAdet + " adet uzunlugu tek olan kelime, \n"+
                ciftSayiAdet +" adet uzunlugu cift sayi olan kelime var");
    }
}
