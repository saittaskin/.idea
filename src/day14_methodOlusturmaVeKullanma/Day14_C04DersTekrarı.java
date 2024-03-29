package day14_methodOlusturmaVeKullanma;

public class Day14_C04DersTekrarı {

    public static void main(String[] args) {

        // Verilen metin palindrome ise true,
        // palindrome degilse false donduren bir method olusturun

        System.out.println(ispalindrome("ey edip adanada pide ye"));

        System.out.println(ispalindrome("sanane"));
    }

    public static boolean ispalindrome (String metin) {

        String tersMetin = "";

        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        if (metin.equalsIgnoreCase(tersMetin)) {

            return true;

        } else {

            return false;
        }

    }
}
