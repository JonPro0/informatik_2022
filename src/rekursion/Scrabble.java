package rekursion;

public class Scrabble {
    private static void createString(int letter){
        char c;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letter; i++) {
            c = (char)(Math.random() * 26 + 65);
            result.append(c);
        }
        BackTracking.kombis(result.toString());
    }
    public static void main(String[] args) {
        createString(5);
    }
}
