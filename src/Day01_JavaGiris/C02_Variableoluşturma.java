package Day01_JavaGiris;

public class C02_Variableoluşturma {

    public static void main(String[] args) {

        int sayi = 10 ;

        // java'daki = isareti, matematikdeki ='den farkli calisir
        // java = isareti gorunce, once esitligin sag tarafindaki degeri hesaplar
        // bulunan islem sonucunu, sol taraftaki variable'a assign eder

        sayi = 2 * sayi ;

        System.out.println(  sayi  ) ; // 20

        sayi = 5 + sayi ;

        System.out.println(  sayi  ) ; // 25

        // 2 * sayi + 1 = 5 * sayi - 7 ;  Variable expected
        // esitligin sol tarafinda islem olmaz, sadece variable ismi olmalidir

        sayi = 5 * sayi - 7 ;

        System.out.println(sayi); // 118

        // int sayi = 20; // Variable 'sayi' is already defined in the scope


        sayi = 2*sayi;
        System.out.println(sayi); // 236

        sayi = 40;

        System.out.println(sayi); // 40

        sayi = 2*sayi;

        System.out.println(sayi); // 80

        sayi = 3*sayi;
        System.out.println(sayi); // 240

        sayi = 100;

        sayi = 2*sayi;
        System.out.println(sayi); // 200
    }
}
