package Day05_Concanation_mantıksalKarşılaştırma;

public class C06_Sorucozum {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean sonuc = a>b;

        if (sonuc) {
            System.out.println("sonuc = " + sonuc);
        }

        sonuc = a<100;

        if (sonuc) {
            System.out.println("sonuc1 = " +  sonuc);
        }

        sonuc = b<0;

        if (sonuc){
            System.out.println("sonuc2 = " + sonuc);
        } else {
            System.out.println("sonuc = " + sonuc);
        }
    }
}
