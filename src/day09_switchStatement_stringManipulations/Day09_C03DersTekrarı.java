package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class Day09_C03DersTekrarı {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden
        //        anlamini ogrenmek istedigini alin
        //        ve girilen harfin karsiligini yazdirin.
        //	      I : International
        //	      S : Software
        //	      T : Testing
        //	      Q : Qualifications
        //	      B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ISTQB kısaltmasında anlamını ogrenmek ıstegınız harfi giriniz...");
        char girilenHarf = scanner.nextLine().toUpperCase().charAt(0);

        switch (girilenHarf) {
            case 'I' :
                System.out.println("I : International");
                break;
            case 'S' :
                System.out.println("S : Software");
                break;
            case 'T' :
                System.out.println("T : Testing");
                break;
            case 'Q' :
                System.out.println("Q : Qualifications");
                break;
            case 'B' :
                System.out.println("B: Board");
                break;
            default:
            System.out.println("Lutfen gecerli bir kararkter giriniz...");
        }
    }
}
