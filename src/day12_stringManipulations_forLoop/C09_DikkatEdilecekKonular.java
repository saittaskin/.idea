package day12_stringManipulations_forLoop;

public class C09_DikkatEdilecekKonular {

    public static void main(String[] args) {

        // i'ye atanan ılk deger icın
        // loop bady calisma sarti false oluyorsa
        // loop bady hıc calsımadan loop bıter

        for (int i = 10; i < 0; i++) {
            System.out.println(i);
        }

        // i'nin degısımı ıle
        // hic bir zaman loop sarti false olmuyorsa
        // buna sonsuz loop denir

        for (int i = 0; i < 10 ; i--) {

            System.out.println(i + " ");
        }
    }
}
