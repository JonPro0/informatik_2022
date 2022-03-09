package rekursion;

public class BackTracking {
    //romy roym
    //rmoy rmyo
    //ryom rymo
    //yrom yrmo
    //yomr yorm
    //ymro ymor
    //omry omyr
    //ormy orym
    //oymr oyrm
    //mroy mryo
    //myor myro
    //mory moyr
    private static void kombis(String text){
        kombis("", text);
    }
    private static void kombis(String schon, String noch){
        if (noch.length() <= 1){
            schon = noch;
            System.out.println(schon);
        } else {
            for (int i = 0; i < noch.length(); i++) {
                char c = noch.charAt(i);
                String neuesSchon = schon + c;
                String neuesNoch = noch.substring(0, i) + noch.substring(i+1);
                kombis(neuesSchon, neuesNoch);
            }

        }
    }
    public static void main(String[] args) {
        kombis("romy");
    }
}
