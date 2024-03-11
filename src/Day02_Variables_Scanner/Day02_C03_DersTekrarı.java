package Day02_Variables_Scanner;

import java.util.Scanner;

public class Day02_C03_DersTekrarı {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyip
        // sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int tamSayi = scanner.nextInt();

        System.out.println("Girdiginiz tam sayının karesi : " + tamSayi*tamSayi); // 30 karesi ==> 900
    }
}
