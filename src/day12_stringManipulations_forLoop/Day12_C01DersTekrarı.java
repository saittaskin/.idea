package day12_stringManipulations_forLoop;

public class Day12_C01DersTekrarı {

    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi
        //         String fiyatlari toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €

        String input1 = "15.30 €";
        String input2 = "11.45 €";

        input1 = input1.replaceAll("\\D","");
        input2 = input2.replaceAll("\\D","");

        System.out.print("Verilen fiyatlarin toplami : " + (Double.parseDouble(input1) + Double.parseDouble(input2))/100 + " €");














    }
}
