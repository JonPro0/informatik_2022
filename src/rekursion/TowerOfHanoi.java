package rekursion;

public class TowerOfHanoi {
    private static int move = 1;
    public static void towerOfHanoiRecursive(int a, int b){
        if (a == 1){
            System.out.print("Die Zahl ist: " + b);
        } else {
            b = b * 2 + 1;
            towerOfHanoiRecursive(a-1,b);
        }
    }

    public static void towerOfHanoiRecursive(int a){
        towerOfHanoiRecursive(a, 1);
    }

    public static void countMoves(int a) {
        towerOfHanoiRecursive(a);
    }

    public static void countMovesFromAToB(int a, int b){
        for(int i = a; i <= b; i++){
            System.out.print("\n" + i + ": ");
            towerOfHanoiRecursive(i);
        }
    }

    public static void showMoves(int anzahl, int position, int stop) {
        if (stop == 0){
            System.out.println("Step " + move++ + ": " + position + " -> 3");
            System.exit(0);
        }
        int rest = anzahl % 2;
        if(rest == 0) {
            int currentPosition = position + 1;
            if(currentPosition == 4){
                currentPosition = 1;
            }
            System.out.println("Step " + move++ + ": " + position + " -> " + currentPosition);
            System.out.println("Step " + move++ + ": Anderes Teil als zuvor auf einzig mögliche Stelle");
            showMoves(anzahl, currentPosition, stop - 1);
        } else {
            int currentPosition = position + 2;
            if(currentPosition == 4){
                currentPosition = 1;
            } else if (currentPosition == 5) {
                currentPosition = 2;
            }
            System.out.println("Step " + move++ + ": " + position + " -> " + currentPosition);
            System.out.println("Step " + move++ + ": Anderes Teil als zuvor auf einzig mögliche Stelle");
            showMoves(anzahl, currentPosition, stop - 1);
        }
    }

    public static void main(String[] args) {
        //countMoves(5);
        //countMovesFromAToB(1, 10);
        int showMovesNumber = 3;
        showMoves(showMovesNumber, 1, (int) (Math.pow(2, showMovesNumber - 1) - 1));
    }

}
