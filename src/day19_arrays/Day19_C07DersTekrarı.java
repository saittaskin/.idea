package day19_arrays;

public class Day19_C07DersTekrarı {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih","Mustafa","Muhammed"};

        enUzunVeEnKısaKelime(isimler);

    }

    public static void enUzunVeEnKısaKelime (String[] kelimeler){

        String enUzunKelime = kelimeler[0];
        String enKısaKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length() > enUzunKelime.length()) {

                enUzunKelime = kelimeler[i];
            } else if (kelimeler[i].length() < enKısaKelime.length()) {

                enKısaKelime = kelimeler[i];
            }
        }

        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kısa kalime : " + enKısaKelime);
    }
}
