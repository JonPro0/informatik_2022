package adt;
import java.util.LinkedList;
import java.util.Queue;

public class Beispiel {
    int lz;
    String lf;

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Beispiel b = new Beispiel();
        b.lf = "rot";
        b.lz = 5;
        System.out.println(b);

    }

}
