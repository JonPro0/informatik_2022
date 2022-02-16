package rekursion;


public class RekursionRueckgabewerte {
   private static long[] memos = new long[1000];


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

    // Formel: f(n) = f(n-1) + f(n-2)

    public static long kaninchensex(int n){
        return (n < 2) ? 1 : kaninchensex(n-1) + kaninchensex(n-2);
    }

    public static long fibonacci(int n){
        long fibo1 = 0;
        long fibo2 = 1;


        for (int i = 0; i < n; i++) {
            long res = fibo2;
            fibo2 += fibo1;
            fibo1 = res;
        }
        return fibo2;

    }

    private static long fiboIterativ(int n){
        long fib = 1;
        return 1;
    }

    private static long fiboarray(int n) {
        memos[0] = 1;
        memos[1] = 1;
        int gesamt = 0;
        if(n < 2){
            return memos[0];
        } else {
            return memos[n] = fiboarray(n-1) + fiboarray(n-2);
        }
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

       // fibonacci(10);
        /*for (int i = 50; i <= 50; i++) {
            long start = System.currentTimeMillis();
            long result = kaninchensex(i);
            long ende = System.currentTimeMillis() - start;
            System.out.printf("f(%1d) = %15d; Dauer: %.2f%n", i, result, ende / 1000.0);
        }*/
        /*for (int i = 50; i < 51; i++) {
            long pleasebefaster1 = System.currentTimeMillis();
            fibonacci(i);
            long pleasebefaster2 = System.currentTimeMillis() - pleasebefaster1;
            System.out.println("Dauer:" + pleasebefaster2 / 1000.0);
        }*/
        long start = System.nanoTime();
        long n = fibonacci(40);
        long ende = System.nanoTime() - start;
        System.out.println(n);
        System.out.println(ende);

        Fibonacci fib  = new Fibonacci();
        long start2 = System.nanoTime();
        System.out.println(fib.fibonacciMemoized(100));
        long ende2 = System.nanoTime();
        System.out.println(ende2 - start2);
//https://stackoverflow.com/questions/38534460/how-to-convert-a-biginteger-to-a-scientific-notation-string-and-back

    }
}
