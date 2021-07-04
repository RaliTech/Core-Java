import java.util.Scanner;

public class SumofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0, evenNumber = 2;
        // loop from 1 to 100
        for (int count = 1; count <= n; count++) {
            // add current even number to sum
            sum += evenNumber;
            // get the next even number
            evenNumber += 2;
        }
        System.out.println("Sum of even numbers is " + sum);
    }
}
