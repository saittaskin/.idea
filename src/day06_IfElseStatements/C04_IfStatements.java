package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        System.out.println("Lutfen ucgenın kenar uzunluklarını gırınız...");

        Scanner scanner = new Scanner(System.in);

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgen");
        }

    }
}
