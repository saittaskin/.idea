package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C04_gurup {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyip
        // metnin sadece ilk harfini, buyuk harf olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır metın giriniz...");
        String metin = scanner.nextLine();

        System.out.println("girmiş oldugunuz metnın son karakterinin buyk harf ile yazılısı : "
                + metin.toUpperCase().charAt(metin.length()-1) );

        System.out.println("Girmiş ldugunuz metinin on beşinci karakterin buyuk yazılısı : " + metin.toUpperCase().charAt(0));

        // System.out.println("Girmiş ldugunuz metinin ilk harfinin kucuk yazılısı : " + metin.toLowerCase().charAt(0));


















    }
}
