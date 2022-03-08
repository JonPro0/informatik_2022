package rekursion;

public class Ackermann {
    private static long doAckermann(long n, long m){
        if(n == 0){
            return m + 1;
        } else if (n != 0 && m == 0){
            return doAckermann(n -1, 1);
        } else {
            return doAckermann(n-1, doAckermann(n, m-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(doAckermann(1, 0));
    }
}
