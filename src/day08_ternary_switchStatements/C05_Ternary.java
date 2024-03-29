package day08_ternary_switchStatements;

public class C05_Ternary {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan notunu alin
        //       50 veya daha buyukse ”Sinifi Gectin”,
        //       50’den kucukse “Maalesef kaldin” yazdirin.

        int not = -2;

        if (not<0 || not>100) {
            System.out.println("Lutfen gecerlı bir not giriniz");
        } else if (not>=50) {
            System.out.println("Sınıfı geçtin");
        } else {
            System.out.println("Malesef kaldın");
        }

        System.out.println(not<0 || not>100 ? "Lutfen gecerlı bir not giriniz" : not>50 ?  "sınıfı gectın" : "maalesef kaldın");
    }
}
