package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Day07_C06DersTekrarı {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldıgınız urunlerın ındırımsız fiyatını giriniz...");
        double indirimsizFiyat = scanner.nextDouble();

        double tolamFiyat = urunAdedi*indirimsizFiyat;

        scanner = new Scanner(System.in);
        System.out.println("Musteri kartınız varmı : 'E' = evet , 'H' = 'Hayır'...");
        char kart = scanner.nextLine().toUpperCase().charAt(0);

        if (kart == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli olarak : " + tolamFiyat*80/100 + "Tl' ye alabılırsiniz");
        } else if (kart == 'E' && urunAdedi < 10) {
            System.out.println("%15 indirimli olarak : " + tolamFiyat*85/100 + "Tl' ye alabılırsiniz");
        } else if (kart == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirimli olarak : " + tolamFiyat*85/100 + "Tl' ye alabılırsiniz");
        } else if (kart == 'H' && urunAdedi < 10) {
            System.out.println("%10 indirimli olarak : " + tolamFiyat*85/100 + "Tl' ye alabılırsiniz");
        }else {
            System.out.println("Lutfen 'evet' veya 'hayır' şeklınde cevap veriniz");
        }
    }
}
