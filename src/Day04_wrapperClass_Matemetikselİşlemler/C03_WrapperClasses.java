package Day04_wrapperClass_Matemetikselİşlemler;

public class C03_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 20;

        String str = "Java Candır";

        // primitive data turleri sadece deger barindirir,
        // non primitive data turleri ise hem deger, hem de hazir method'lar barindirir

        System.out.println(str.toUpperCase()); // JAVA CANDIR yazdırır.

        // Java primitive data turleri ile de bazi method'lari kullanabilmemiz icin
        // Wrapper class'lari olusturmustur.
        // Wrapper class'lar primitive'ler ile ayni isimlere sahiptir
        // ancak non-primitive olduklari icin class isimleri buyuk harfle baslar
        // Boolean, Character, Byte, Short, Integer, Long, Float ve Double

        char chr1 = 'a';

        System.out.println(chr1); // a

        // chr1 primitive char oldugundan hazir method'lari olmaz

        Character chr2 = 'b';

        System.out.println(chr2.charValue()); // b

        System.out.println(Character.isLowerCase(chr1)); // true

        System.out.println(Character.isDigit(chr1)); // FALSE

        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
