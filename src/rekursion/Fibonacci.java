package rekursion;

public class Fibonacci {
    private long[] cache;

    public Fibonacci() {
        cache = new long[100];
        cache[0] = 1;
        cache[1] = 1;
    }

    public long fibonacciMemoized(int n) {
        if (cache[n] > 0) {
            return cache[n];
        } else {
            long tmp = fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2);
            // 1. tmp im Cache speichern
            return cache[n] = tmp;

            // 2. Zurückgeben

        }
    }
}

