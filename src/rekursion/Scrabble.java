package rekursion;

import utils.FileLoader;

public class Scrabble {
    private static int counter;

    private static void createString(int letter) {
        char c;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letter; i++) {
            c = (char) (Math.random() * 26 + 65);
            result.append(c);
        }
        BackTracking.kombis(result.toString());
        String[] compare = FileLoader.load("Sowpods.txt");
        for (int i = 0; i < compare.length; i++) {
            if ("AA".equals(compare[0])) {
                counter++;
                System.out.println(counter);
            }
        }
        System.out.println("Es wurden " + counter + " echte Wörter gefunden");

    }

    public static void main(String[] args) {
        createString(5);
    }
}
