package rekursion;

public class NumberMixer {
    public static void kombisNumber(String text){
        kombisNumber("", text);
    }
    private static void kombisNumber(String schon, String noch){
        if (noch.length() <= 1){
            schon += noch;
            int add1 = Integer.parseInt(schon.substring(0,1));
            int add2 = Integer.parseInt(schon.substring(1,2));
            System.out.printf("%d + %d = %2d\n",add1, add2, add1+add2);
        } else {
            for (int i = 0; i < noch.length(); i++) {
                char c = noch.charAt(i);

                String neuesNoch = noch.substring(0, i) + noch.substring(i+1);
                kombisNumber(schon + c, neuesNoch);
            }

        }
    }
    /*
    for(i=0;i<länge;i++){
        for(j=i;j<länge;j++){
            zahl an i + ua
        }
    }
     */



    public static void main(String[] args) {
        kombisNumber("792");
    }
}
