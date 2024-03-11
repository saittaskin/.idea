package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C06_DersTekrarı {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //        cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cemberin yarıcapini giriniz... ");
        double yariCap = scanner.nextDouble();

        System.out.println("Çemberin alanı : " + (yariCap*yariCap)*3.14); // Çemberin alanı : 78.5
        System.out.println("Çemberin çevresi : " + (int)(yariCap*2*3.14)); // Çemberin çevresi : 31
    }
}
