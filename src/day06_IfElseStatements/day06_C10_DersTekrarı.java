package day06_IfElseStatements;

import java.util.Scanner;

public class day06_C10_DersTekrarı {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.nextLine().toUpperCase().charAt(0);

        if (Character.isLowerCase(harf)) {
            System.out.println(Character.toUpperCase(harf));
        } else {
            System.out.println(harf);
        }
    }
}
