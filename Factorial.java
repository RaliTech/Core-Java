import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(n + "Factorial is = " + fact);
    }
}