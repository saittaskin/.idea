package Day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullanıcıBilgileriniYazdırma {

    public static void main(String[] args) {

        // - Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi yazınız...");

        String isiminiz = scanner.nextLine();

        System.out.println("Lutfen sayisminizi yazınız...");

        String soyİsim = scanner.nextLine();

        System.out.println("Lutfen yasınızı giriniz...");

        int yaş = scanner.nextInt();

        System.out.println("isminiz : "+ isiminiz + "\nsoyisminiz : "+ soyİsim +
                           "\nyasınız : "+ yaş + "\nKaydiniz basariyla tamamlanmistir." );


    }
}
