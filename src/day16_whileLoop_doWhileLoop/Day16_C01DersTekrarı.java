package day16_whileLoop_doWhileLoop;

public class Day16_C01DersTekrarı {

    public static void main(String[] args) {

        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        System.out.println(metniTerseCevirme("Ali topu tut"));
        System.out.println(metniTerseCevirme("Java cok guzel"));

    }

    public static String metniTerseCevirme (String metin) {

        // Ali topu tut

        int index = metin.length()-1;
        String tersMetin = "";

        while (index >= 0) {
            tersMetin += metin.charAt(index);

            index--;
        }
        return tersMetin;
    }
}
