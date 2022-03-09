package rekursion;

public class StringsUmkehren {
    private static String reverse(String text){
        if(text.length() == 0){
            return text;
        } else {
            return reverse(text.substring(1) + text.charAt(0));
        }
    }
    public static void main(String[] args) {

    }
}
