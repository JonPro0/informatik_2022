package rekursion;

public class Rekursion1 {
    private static int  i = 1;
    private int position = 1;
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

  public static void tvHR(int a, int b){
    if (a == 1){
      System.out.print("Die Zahl ist: " + b);
    } else {
      b = b * 2 + 1;
      tvHR(a-1,b);
    }
  }

  public static void showMoves(int anzahl) {
        int rest = anzahl % 2;
        if(rest == 0) {
            for (int j = 0; j < Math.pow(2, anzahl) - 1; j++) {
                System.out.println();
            }
        }
    }

public static void tvHR(int a){
    tvHR(a, 1);
  }

    public static void main(String[] args) {
        //System.out.println(addiereInterativ(4,7,0));
        for(int i = 1; i <= 10; i++){    
      System.out.print("\n" + i + ": ");
      tvHR(i);
    }
}
}
