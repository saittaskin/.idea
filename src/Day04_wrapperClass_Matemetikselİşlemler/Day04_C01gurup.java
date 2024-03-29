package Day04_wrapperClass_Matemetikselİşlemler;

import java.util.Scanner;

public class Day04_C01gurup {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin
        //         ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz...");

        char harf = scanner.next().charAt(0);

        System.out.println("Girmis oldugunuz harften bir sonraki harf : " + (char) (harf + 1));

        System.out.println("Girmis oldugunuz harften iki sonraki harf : " + (char) (harf + 2));

        System.out.println("Girmis oldugunuz harften üç sonraki harf : " + (char) (harf + 3));
    }
}
