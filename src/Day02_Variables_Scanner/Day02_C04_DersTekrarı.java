package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C04_DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyip
        // metnin sadece ilk harfini, buyuk harf olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scan.nextLine();

        System.out.println("Girilen metnin ilk harfinin buyuk harf ile yazilisi : " + metin.toUpperCase().charAt(0));

        System.out.println("Lutfen bır metın daha giriniz...");

        char ilkHarf = scan.nextLine().toUpperCase().charAt(0);

        System.out.println("Girilen 2.metnin ilk harfinin buyuk harf ile yazilisi : " + ilkHarf);
    }
}
