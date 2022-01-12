package rekursion;

public class Rekursion1 {
    private static int  i = 1;
    public static boolean b = true;
    public static void rekursion1(){
        rekursion1();
    }

    public static void rekursion2(){
        if(true){
            System.out.println("Keine Rekursion");
        } else {
            System.out.println(i + "Hallo Rekursion");
            i += 1;
            rekursion2();
        }
    }

    public static void rekursion3(int n){
        if(n == 5){
            System.out.println(n);
        } else {
            if(b){
                System.out.println("Lift-Off");
                b = false;
            }
            System.out.println(n);
            rekursion3(n+1);
        }
    }

    public static void rekursion4(int n){
        if(n == 5){
            System.out.println(n);
        } else {
            if(b){
                System.out.println("Lift-Off");
                b = false;
            }
            System.out.println(n);
            rekursion4(n+1);
        }
    }

    public static void rekursion5(int n){
        if(n == 0){
            System.out.println("Lift-Off");
        } else {
            rekursion5(n-1);
            System.out.println(n);
        }
    }

    public static void rekursion6(int n){
        if(n == 0){
            System.out.println("Lift-Off");
        } else {
            System.out.println(n);
            rekursion6(n-1);
            System.out.println(n);
        }
    }

    public static int addiereInterativ(int a, int b, int c) {
        if (b == 0) {
            return c;
        } else {
            return addiereInterativ(a, b-1, c+a);
        }
    }




    public static void main(String[] args) {
        System.out.println(addiereInterativ(4,7,0));
    }
}
