package rekursion;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int pivot = partition(a, l, r);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, r);
        }
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = a[(left + right) / 2];
        while (true) {
            while (a[left] < pivot){
                left += 1;
            }
            while (a[right] > pivot) {
                right -= 1;
            }

            if (left >= right) {
                return right;
            }

            swap(a, left, right);
            System.out.println("Vertausche " + a[left] + " mit " + a[right]);
        }
    }

    private static void testPartition(){
        int[] feld = {14, 34, 30, 27, 5, 53, 12};
        System.out.println(Arrays.toString(feld));
        partition(feld, 0, feld.length - 1);
        System.out.println(Arrays.toString(feld));
    }

    private static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] feld = {14, 34, 30, 27, 5, 53, 12};
        System.out.println(Arrays.toString(feld));
        quickSort(feld, 0, feld.length - 1);
        System.out.println(Arrays.toString(feld));
    }
}

