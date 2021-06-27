import java.util.Arrays;
import java.util.*;

public class Kth {
    public static int show(Integer[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String args[]) {
        Integer arr[] = new Integer[] { 10, 4, 6, 9, 21 };
        int k = 3;
        System.out.print("K th smallest element is " + show(arr, k));
    }
}