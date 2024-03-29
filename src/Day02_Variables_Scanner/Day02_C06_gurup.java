package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C06_gurup {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //        cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cameberin yarıcapini giriniz...");
        double yariCap = scanner.nextDouble();

        System.out.println("Cemaberin alanı : " + (int)((yariCap*yariCap) * 3.14));

        System.out.println("Cemberin cevresi : " + (yariCap * 2 * 3.14));





















    }
}
