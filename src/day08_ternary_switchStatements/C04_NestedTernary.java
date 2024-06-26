package day08_ternary_switchStatements;

public class C04_NestedTernary {

    public static void main(String[] args) {

        /*
            Ikiden fazla sonuc olasiligi olan gorevlerde
            Ternary pek tercih edilmez
         */

        // verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        // - sayi negatif
        // - 0 pozitif veya negatif degildir

        int sayı = 0;

        if (sayı>0){
            System.out.println("sayı pozitif");
        } else if (sayı<0) {
            System.out.println("sayı negatif");
        }else {
            System.out.println("0 pozitif veya negatif sayı değildir");
        }

        System.out.println( sayı>0 ? "Sayi pozitif" : "Sayi 0 veya negatif olabilir" );

        System.out.println( sayı>0 ? "Sayi pozitif" : sayı == 0 ? "0 pozitif veya negatif degildir" : "Sayi negatif" );
    }
}
