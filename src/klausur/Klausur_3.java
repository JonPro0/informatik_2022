package klausur;

public class Klausur_3 {
    static int[] array = new int[]{50, 6, 7, 8, 9, 10, 42, 45, 563, 678};
    static int min;

    private static int ggt(int x, int y) {
        int rest = x % y;
        if (rest == 0) {
            return y;
        }
        return ggt(y, rest);
    }

    private static int _min(int[] a, int left, int right){
        if(left >= right){
            return min;
        }
        if(a[left] < a[right] && a[left] < min){
            min = a[left];
        } else if(a[left] > a[right] && a[right] < min){
            min = a[right];
        }
        return _min(a, left + 1, right - 1);
    }

    private static int _min(int[] a){
        min = a[0];
        return _min(a, 0, a.length - 1);
    }

    private static int min(int[] arr, int left, int right){
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(_min(array));
    }
}
