import java.util.Arrays;

public class Ingram {
    public static void main(String[] args) {
        String n = "Java";
        String n1 = "Java";
        // Converting both string into lower case
        n = n.toLowerCase();
        n1 = n1.toLowerCase();
        if (n.length() != n1.length()) {
            System.out.println("BNoth the string are not angram");
        } else {
            char[] a = n.toCharArray();
            char[] b = n1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b) == true) {
                System.out.println("Both the string are angram");
            } else {
                System.out.println("Both the string are not angram");
            }
        }
    }
}