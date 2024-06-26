package day16_whileLoop_doWhileLoop;

public class C02_UsAlma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //         bir method olusturun.

        usAl(2,5); // 2 uzeri 5 = 32
        usAl(3,4); // 3 uzeri 4 = 81
    }

  public static void usAl(int sayi , int pozitifUs) {

      // 2 uzeri 5 'u hesapla ==> 2*2*2*2*2 => 32

      int sonuc = 1;
      int hesaplacakUs = pozitifUs;

      while (hesaplacakUs > 0) {

          sonuc *= sayi;
          hesaplacakUs--;
      }
      System.out.println(sayi + " uzeri " + pozitifUs + " = " + sonuc);
  }
}
