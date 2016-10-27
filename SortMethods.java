package sortPackage;

import java.util.Random;
import java.util.*;

public class SortMethods {


    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {

            // minimum from a[i] to a[n-1]
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (a[minIdx] > a[j]) {
                    minIdx = j;
                }
            }

            swap(a, i, minIdx);
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (a[j] > a[j-1]) {
                    break;
                }
                swap(a, j-1, j);
            }
        }
    }

    public static void main(String[] args) {
        int len = 100000;
        int[] a = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            a[i] = random.nextInt(100000);
        }
        long start = System.currentTimeMillis();
        insertionSort(a);
        long end   = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(a));
        System.out.println("time elapsed: " + end + " milliseconds");
    }
}

