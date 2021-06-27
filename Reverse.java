import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number:");
        int n = sc.nextInt();
        System.out.println("Without reverse number is " + n);
        // Using algorithm
        // int rev = 0;
        /*
         * while (n != 0) { rev = rev * 10 + n % 10; n = n / 10; }
         */
        // StringBuffer Class
        /*
         * StringBuffer sb = new StringBuffer(String.valueOf(n)); StringBuffer rev =
         * sb.reverse();
         */
        // Using StringBuilder class
        StringBuilder bl = new StringBuilder(String.valueOf(n));
        bl.append(n);
        StringBuilder rev = bl.reverse();
        System.out.println("Reverse number is =" + rev);
    }
}