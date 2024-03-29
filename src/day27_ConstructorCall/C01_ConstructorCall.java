package day27_ConstructorCall;

public class C01_ConstructorCall {

    C01_ConstructorCall() { // Cons 1

        // Cons 2 yi cagiralim
        this("Java"); // constructor call ilk satırda olmalıdır
    }

      void C01_ConstructorCall () { // Method 1

    }

    C01_ConstructorCall(String str) { // Cons 2

    }

    C01_ConstructorCall(int a) { // Cons 3
        // C01_ConstructorCall("Java");
        // isim() : bu sytax method call icindir.

        this(); // constructor call bu sytax ile calisir.

    }

    int C01_ConstructorCall (double d) { // Method 2

        C01_ConstructorCall();

        return 0;
    }

    public static void main(String[] args) {

    }
}
