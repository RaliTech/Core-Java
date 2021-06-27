public class Fibonacci {
    public static void main(String[] args) {
        int n = 0, n1 = 1, n2, i, count = 10;
        System.out.print(n + " " + n1);
        for (i = 2; i < count; i++) {
            n2 = n + n1;
            System.out.println(" " + n2);
            n = n1;
            n1 = n2;

        }
    }
}