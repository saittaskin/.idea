package Day05_Concanation_mantıksalKarşılaştırma;

public class C04_DersSoruÇözüm {

    public static void main(String[] args) {

       // Soru : Asagidaki kod calistirilirsa konsolda gorunecek sonuclar neler olur?

        int a = 10;

        System.out.println(" a'nın değeri : " + a++); // a'nın değeri : 10

        int b = a++;

        System.out.println("b'nin degeri: " + b); // b'nin degeri: 11

        int c = b++ + a;

        System.out.println("c'nin degeri : " + c); // c'nin degeri : 23

        System.out.println("son toplam : " + (a+b+c)); // son toplam : 47
    }
}
