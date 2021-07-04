public class OddEvenArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 10, 12, 13, 17, 20, 26, 22, 45, 44, 26 };
        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
