package klausur;

public class Klausur_3_complete {
    private static int sum;
    public static void wasMachtDas(int n){
        if (n >= 10){
            wasMachtDas(n / 10);
        }
        System.out.println(n + ", ");
    }

    public static void number3(int n){
        if (n > 0){
            System.out.println(n);
            number3(n-5);
        }
        System.out.println(n);
    }

    public static boolean number4(int[] array, int gesucht, int l, int r){
        if (l>r) return false;
        else if(array[l] == gesucht || array[r] == gesucht) return true;
        return  number4(array, gesucht, l + 1, r - 1);

    }

    public static boolean number4(int gesucht){
        int[] array = {105, 1, 3, 7, 9, 6, 9};
        return number4_2(array, gesucht, 0, array.length - 1);
    }

    public static boolean number4_2(int[] array, int gesucht, int l, int r){
        if (l>r){
            return array[l] == gesucht;
        }

        int mitte = (l + r) / 2;
        if (array[mitte] == gesucht) return true;
        boolean check = number4_2(array, gesucht, l + 1, mitte);
        boolean check2 = number4_2(array, gesucht, mitte, r - 1);
        return check || check2;
    }


    public static int number5(){
        int[][] array = {
                {5},
               {5, 1},
              {8, 8, 2},
             {6, 8, 8, 4},
            {6, 7, 4, 3, 9},
           {1, 7, 7, 7, 4, 4},
          {5, 1, 3, 9, 7, 6, 8},
         {1, 6, 8, 8, 5, 2, 2, 4, 2}
        };
        sum = array[0][0];
        return number5(array, 0, 0);
    }

    public static int number5(int[][] dreieck, int row, int col){
        if(row == dreieck.length - 1)return sum;
        if (dreieck[row + 1][col] < dreieck[row + 1][col + 1]){
            sum += dreieck[row + 1][ col];
            return number5(dreieck, row + 1, col);
        } else {
            sum += dreieck[row + 1][ col + 1];
            return number5(dreieck, row + 1, col + 1);
        }
    }

    public static void main(String[] args) {
        //number3(16);
        System.out.println(number4(3));
    }
}
