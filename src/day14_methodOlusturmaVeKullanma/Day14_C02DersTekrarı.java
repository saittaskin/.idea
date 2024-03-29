package day14_methodOlusturmaVeKullanma;

public class Day14_C02DersTekrarı {

    public static void main(String[] args) {

        // Verilen iki sayidan, buyuk olani yazdiran bir method olusturun
        // eger sayilar esitse, "esit sayilarda buyuk olan yoktur"

        sayiYazdirma(5,8); // Sayilardan buyuk olan : 8
        sayiYazdirma(5,1); // Sayilardan buyuk olan : 5
        sayiYazdirma(6,6); // esit sayilarda buyuk olan yoktur

    }

    public static void sayiYazdirma (int sayi1 , int sayi2) {

        if (sayi1 > sayi2) {

            System.out.println("Sayilardan buyuk olan : " + sayi1);

        } else if (sayi2 > sayi1) {

            System.out.println("Sayilardan buyuk olan : " + sayi2);

        } else {

            System.out.println("esit sayilarda buyuk olan yoktur");
        }
    }
}
