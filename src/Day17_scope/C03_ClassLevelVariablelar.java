package Day17_scope;

public class C03_ClassLevelVariablelar {

    /*
       Eger tum method'lardan kullanabılacagimiz veriablelara  ihtiyacımız olursa
       Bu veriableları calss lavel de olustururuz

       class level demek classin icinde ama tum kod bloklarının dısında demektır
       genel olarak calass level veriablelar callsın en ust kısmnında olusturulur

       1- class level veriablelarin scope'u BUTUN CLASS'DIR.
       Ancak class level veriabl'larda staric keywordu de etkilidir

       2- Variable static olarak isaretlenmis se
       class icerisinde direkt kullanilabilir
       ama variable static degilse, static methodlardan kullanılmaz

       3- Static keywordu methodlar icinde kullanılır
       Static keywordu lar bunyelerine
       static olmayan variableleri kabul etmezler

       4- class variableler deger atanmadan olusturulabılır ve kullanılabılır
       eger biz deger atamadan variable kullanılırsa java variablar DEFAULT DEGER (varsayılan) deger ataması yapar
       boolean ==> false
       char ==> ' ' (hiclik)
       byte,short,integer,long,float,double ==> 0
       non-Primitiv data turleri ıcın ==> null olarak isaretler
     */

    int sayi1;
    int sayi2 = 20;

    static String str;
    static String str2 = "Java";

    public static void main(String[] args) {

        // System.out.println(sayi1);
        // System.out.println(sayi2);
        System.out.println(str);
        System.out.println(str2);
    }

    public static void method1(){

        // System.out.println(sayi1);
        // System.out.println(sayi2);
        System.out.println(str);
        System.out.println(str2);
    }

    public void method2() {

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(str);
        System.out.println(str2);
    }
}
