package rekursion;


public class RekursionRueckgabewerte {
    private static int ergebnisJonas = 1;


    public static int fakultaet1(int zahl){
        int ergebnis = zahl;
        for (int i = zahl - 1; i > 0; i--) {
            ergebnis *= i;
        }
        return ergebnis;
    }

    public static int fakultaet2(int n){
        int ergebnis = 1;
        for (int i = 2; i <= n; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }

    public static int fakultaetRekursiv(int zahl){
        if(zahl == 0 || zahl == 1)return 1;
        return zahl * fakultaetRekursiv(zahl-1);
    }

    //TODO: Formel: f(n) = f(n-1) + f(n-2)

    public static int kaninchensex(int n){
        return (n < 2) ? 1 : kaninchensex(n-1) + kaninchensex(n-2);
    }

    public static void fibonacci(int n){
        int fibo1 = 0;
        int fibo2 = 1;
        n = n- 2;
        int res = 1;
        System.out.println(res);
        for (int i = 0; i < n; i++) {
            res = fibo1+fibo2;
            System.out.println(res);
            fibo1 = fibo2;
            fibo2 = res;
        }

        System.out.println((fibo1 + fibo2));

    }



    public static void main(String[] args) {
        //System.out.println(fakultaetRekursiv(0));
        /*long i = System.currentTimeMillis();
        System.out.println(fakultaet1(15));
        long ii = System.currentTimeMillis();
        System.out.println("Zeit: " + (ii - i));

        long a = System.currentTimeMillis();
        System.out.println(fakultaet2(15));
        double aa = System.currentTimeMillis();
        System.out.println("Zeit: " + (aa - a));*/

        fibonacci(10);


    }
}
