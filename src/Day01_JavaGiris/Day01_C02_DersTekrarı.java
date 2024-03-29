package Day01_JavaGiris;

public class Day01_C02_DersTekrarı {
    public static void main(String[] args) {

        int sayı = 20;

        sayı = 3 * sayı;
        System.out.println(sayı); // 60

        sayı = 5 + sayı;

        System.out.println(sayı); // 65

        sayı = sayı * 2;

        System.out.println(sayı); // 130

        sayı = 30;

        sayı -=10;

        System.out.println( sayı ); // 20

        sayı = 40 * sayı - 789;

        System.out.println(sayı); // 11

        System.out.println("=====================================================================");

        int not1,not2,not3,not4,ortNot;

        not1 = 20;
        not2 = 40;
        not3 = 50;
        not4 = 90;
        ortNot = (not4 + not2)/3;

        System.out.println(not1 + not2 + not3 * 30); // 1560
        System.out.println(ortNot); // 43
    }
}
