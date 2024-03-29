package Day04_wrapperClass_Matemetikselİşlemler;

public class Day04_C04_DersTekrarı {

    public static void main(String[] args) {

        // string olarak verilen iki tam sayıyı toplayın

        String sayi1 = "20";
        String sayi2 = "35";

        System.out.println("Verilen iki string sayının toplamı : " + (Integer.parseInt(sayi1) + Integer.parseInt(sayi2))); // 55

        String fiyatStr3 = "23.56";
        String fiyatStr4 = "45.21";

        System.out.println(Double.parseDouble(fiyatStr3) + Double.parseDouble(fiyatStr4)); // 68.77
    }
}
