import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = new int[] { 10, 25, 5, 20, 15, 45, 30, 14, 23, 43 };
        // with sort()
        // Arrays.sort(arr);
        // without sort() method
        System.out.println("Elements of array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
