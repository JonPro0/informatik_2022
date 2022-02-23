package rekursion;

public class RekursionGroßundKlein {
    public static char großUndKlein(String t, String ergebnis){
        char x = t.charAt(0);

        return x;
    }

    public static char großUndKlein(String t){
        return großUndKlein(t, "");
    }
    public static void main(String[] args) {
        System.out.println(großUndKlein("ABC"));
    }
}
