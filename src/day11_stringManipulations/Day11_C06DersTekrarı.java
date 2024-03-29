package day11_stringManipulations;

public class Day11_C06DersTekrarı {

    public static void main(String[] args) {

        // verilen String'deki tum ozel karakterleri,
        // sayilari ve yanyana birdenfazla olan space'leri temizleyin
        // ornek  input : J10a6%v*a     C^7an@90dir
        //        output: Java Candir

        String metin = "J10-------------*******a622222222¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨%v*a           ;,,,,,,,,,,,,,,,,,,,++++++++++++  C^7an@90dir";

        metin = metin.replaceAll("\\s+"," ");

        metin = metin.replaceAll("\\d","");

        metin = metin.replaceAll(" ","5");

        metin = metin.replaceAll("\\W","");

        metin = metin.replaceAll("5"," ");

        System.out.println(metin);

    }
}
