public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping the values are " + a + " " + b);
        // with using third variable
        /*
         * int temp = a; a = b; b = temp;
         */
        // without third variable

        /*
         * a = a + b; b = a - b; a = a - b;
         */
        // use * and / without using third variable
        // Here a and b value should not be zero
        /*
         * a = a * b; b = a / b; a = a / b;
         */
        // Bitwise XOR(^) Operator
        /*
         * a = a ^ b; b = a ^ b; a = a ^ b;
         */
        // Single Statement
        b = a + b - (a = b);
        System.out.println("After swapping the numebr " + a + " " + b);
    }
}