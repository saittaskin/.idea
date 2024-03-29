package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanıcıdan pozitif bir tamsayi isteyin,
        //         sayının tam kare olup olmadıgını bulunuz,
        //         tam kare ise true degilse false yazdırınız,
        // Ornek : input : 16 , Output : 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozıtıf bır tam sayı giriniz...");
        int sayi = scanner.nextInt();

        int kareKök = 1;
        boolean tamkareMi = false;

        while (kareKök * kareKök <= sayi) {

            if (kareKök * kareKök == sayi) {
                System.out.println("Girilen sayi " + kareKök + " sayisinin tam karesidir.");
                tamkareMi = true;
            }
            kareKök++;

        }
        System.out.println(tamkareMi);
    }
}
